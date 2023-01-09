package com.dbanalyzer.dbpkproject.manager;

import com.dbanalyzer.dbpkproject.controllers.enums.JsonSize;
import com.dbanalyzer.dbpkproject.csv.dto.MovieDto;
import com.dbanalyzer.dbpkproject.csv.mapper.DynamoMapper;
import com.dbanalyzer.dbpkproject.csv.mapper.PostgresMapper;
import com.dbanalyzer.dbpkproject.database.dynamo.service.DynamoService;
import com.dbanalyzer.dbpkproject.database.postgres.services.PostgresService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

import static com.dbanalyzer.dbpkproject.controllers.enums.JsonSize.HUGE;
import static com.dbanalyzer.dbpkproject.controllers.enums.JsonSize.TINY;

@Component
public class UploadService {

    private final PostgresService postgresService;
    private final DynamoService dynamoService;

    private final DynamoMapper dynamoMapper;
    private final PostgresMapper postgresMapper;
    private final ObjectMapper objectMapper;

    private static final String JSON_FILE_PATH = "/json/";
    private static final String JSON_PREFIX = ".json";

    public UploadService(PostgresService postgresService, DynamoService dynamoService, DynamoMapper dynamoMapper, PostgresMapper postgresMapper, ObjectMapper objectMapper) {
        this.postgresService = postgresService;
        this.dynamoService = dynamoService;
        this.dynamoMapper = dynamoMapper;
        this.postgresMapper = postgresMapper;
        this.objectMapper = objectMapper;
    }

    public void performDatabaseUpload(DataBaseService dataBaseService, JsonSize jsonSize) throws IOException {
        List<MovieDto> movieDtoList = loadMoviesFromJson(jsonSize);
        List<MovieDto> smaller = movieDtoList.stream().limit(100).collect(Collectors.toList());

        //TODO::: implement dataBaseService wildcards
        //dataBaseService.save(movieDtoList);

//        dynamoService.save(dynamoMapper.mapToEntitiesList(movieDtoList));
        postgresService.save(postgresMapper.mapToEntitiesList(smaller));

    }

    private List<MovieDto> loadMoviesFromJson(JsonSize jsonSize) throws IOException {
        InputStream is = null;
        switch (jsonSize) {
            //100k
            case HUGE -> is = UploadService.class.getResourceAsStream(JSON_FILE_PATH + HUGE + JSON_PREFIX);

            //10
            case TINY -> is = UploadService.class.getResourceAsStream(JSON_FILE_PATH + TINY + JSON_PREFIX);
        }
        CollectionType msgFromJSON = objectMapper.getTypeFactory().constructCollectionType(List.class, MovieDto.class);
        return objectMapper.readValue(is, msgFromJSON);
    }

}