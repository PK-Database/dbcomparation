package com.dbanalyzer.dbpkproject.manager;

import com.dbanalyzer.dbpkproject.csv.CsvFileToObjectConverter;
import com.dbanalyzer.dbpkproject.csv.dto.AccidentDto;
import com.dbanalyzer.dbpkproject.csv.mapper.CassandraMapper;
import com.dbanalyzer.dbpkproject.csv.mapper.DynamoMapper;
import com.dbanalyzer.dbpkproject.csv.mapper.PostgresMapper;
import com.dbanalyzer.dbpkproject.database.cassandra.services.CassandraService;
import com.dbanalyzer.dbpkproject.database.dynamo.service.DynamoService;
import com.dbanalyzer.dbpkproject.database.postgres.services.PostgresService;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Component
public class DatabaseUploadManager {

    private final CsvFileToObjectConverter csvFileToObjectConverter;
    private final PostgresMapper postgresMapper;
    private final DynamoMapper dynamoMapper;
    private final CassandraMapper cassandraMapper;
    private final PostgresService postgresService;
    private final DynamoService dynamoService;
    private final CassandraService cassandraService;


    public DatabaseUploadManager(CsvFileToObjectConverter csvFileToObjectConverter, PostgresMapper postgresMapper, DynamoMapper dynamoMapper, CassandraMapper cassandraMapper, PostgresService postgresService, DynamoService dynamoService, CassandraService cassandraService) {
        this.csvFileToObjectConverter = csvFileToObjectConverter;
        this.postgresMapper = postgresMapper;
        this.dynamoMapper = dynamoMapper;
        this.cassandraMapper = cassandraMapper;
        this.postgresService = postgresService;
        this.dynamoService = dynamoService;
        this.cassandraService = cassandraService;
    }

    public void performDatabasesUploads(MultipartFile csvFile) throws IOException {

        List<AccidentDto> dtos = csvFileToObjectConverter.convertAccidents(csvFile);
        postgresService.save(postgresMapper.mapToEntitiesList(dtos));
        dynamoService.save(dynamoMapper.mapToEntitiesList(dtos));
        cassandraService.save(cassandraMapper.mapToEntitiesList(dtos));
        //TODO::
        // mongoService.save(postgresMapper.mapToEntities(dtos));

    }
}