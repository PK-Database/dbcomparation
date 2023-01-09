package com.dbanalyzer.dbpkproject.manager;

import com.dbanalyzer.dbpkproject.controllers.enums.JsonSize;
import com.dbanalyzer.dbpkproject.csv.dto.MovieDto;
import com.dbanalyzer.dbpkproject.csv.mapper.CassandraMapper;
import com.dbanalyzer.dbpkproject.csv.mapper.DynamoMapper;
import com.dbanalyzer.dbpkproject.csv.mapper.PostgresMapper;
import com.dbanalyzer.dbpkproject.database.cassandra.services.CassandraService;
import com.dbanalyzer.dbpkproject.database.dynamo.service.DynamoService;
import com.dbanalyzer.dbpkproject.database.postgres.services.PostgresService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UploadService {

    private final PostgresService postgresService;
    private final DynamoService dynamoService;
    private final CassandraService cassandraService;
    private final DynamoMapper dynamoMapper;
    private final PostgresMapper postgresMapper;
    private final CassandraMapper cassandraMapper;
    private final ObjectMapper objectMapper;

    private static final String JSON_FILE_PATH = "/json/";
    private static final String JSON_PREFIX = ".json";

    public UploadService(PostgresService postgresService, DynamoService dynamoService, CassandraService cassandraService, DynamoMapper dynamoMapper, PostgresMapper postgresMapper, CassandraMapper cassandraMapper, ObjectMapper objectMapper) {
        this.postgresService = postgresService;
        this.dynamoService = dynamoService;
        this.cassandraService = cassandraService;
        this.dynamoMapper = dynamoMapper;
        this.postgresMapper = postgresMapper;
        this.cassandraMapper = cassandraMapper;
        this.objectMapper = objectMapper;
    }

    public void performDatabaseUpload(DataBaseService dataBaseService, JsonSize jsonSize) throws IOException {
        List<MovieDto> movieDtoList = loadMoviesFromJson(jsonSize);

        //forTesting
        List<MovieDto> smaller = movieDtoList.stream().limit(100).collect(Collectors.toList());

        //TODO::: implement dataBaseService wildcards
        //dataBaseService.save(movieDtoList);

        postgresService.save(postgresMapper.mapToEntitiesList(smaller));
        dynamoService.save(dynamoMapper.mapToEntitiesList(smaller));
        cassandraService.save(cassandraMapper.mapToEntitiesList(smaller));
        var moviesPG = postgresService.getMovies();
        var moviesDynamo = dynamoService.getMovies();
        var moviesCass = cassandraService.getMovies();

        System.out.println("XD");
    }

    private List<MovieDto> loadMoviesFromJson(JsonSize jsonSize) throws IOException {
        InputStream is = loadJson(jsonSize);
        CollectionType msgFromJSON = objectMapper.getTypeFactory().constructCollectionType(List.class, MovieDto.class);
        return objectMapper.readValue(is, msgFromJSON);
    }

    private InputStream loadJson(JsonSize jsonSize) {
        return UploadService.class.getResourceAsStream(JSON_FILE_PATH + jsonSize + JSON_PREFIX);
    }

}