package com.dbanalyzer.dbpkproject.manager;

import com.dbanalyzer.dbpkproject.controllers.enums.DatabaseType;
import com.dbanalyzer.dbpkproject.database.cassandra.services.CassandraService;
import com.dbanalyzer.dbpkproject.database.postgres.services.PostgresService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DatabaseManager {

    private final PostgresService postgresService;

    private final CassandraService cassandraService;

    public DataBaseService specifyDatabaseService(DatabaseType databaseType) {
        switch (databaseType) {
            case POSTGRESQL:
                return postgresService;
            case CASSANDRA:
                return cassandraService;
            default:
                throw new IllegalStateException("elo");
        }
    }

}