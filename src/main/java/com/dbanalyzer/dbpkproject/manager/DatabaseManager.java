package com.dbanalyzer.dbpkproject.manager;

import com.dbanalyzer.dbpkproject.controllers.enums.DatabaseType;
import com.dbanalyzer.dbpkproject.database.cassandra.services.CassandraService;
import com.dbanalyzer.dbpkproject.database.dynamo.service.DynamoService;
import com.dbanalyzer.dbpkproject.database.postgres.services.PostgresService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DatabaseManager {

    private final PostgresService postgresService;
    private final DynamoService dynamoService;
    private final CassandraService cassandraService;

    public DataBaseService specifyDatabaseService(DatabaseType databaseType) {
        return switch (databaseType) {
            case POSTGRESQL -> postgresService;
            case DYNAMODB -> dynamoService;
            case CASSANDRA -> cassandraService;
            default -> throw new IllegalStateException("elo");
        };
    }

}