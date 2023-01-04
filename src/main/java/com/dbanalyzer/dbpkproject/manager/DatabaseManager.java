package com.dbanalyzer.dbpkproject.manager;

import com.dbanalyzer.dbpkproject.controllers.enums.DatabaseType;
import com.dbanalyzer.dbpkproject.database.mongo.services.DatabaseServiceMongo;
import com.dbanalyzer.dbpkproject.database.postgres.services.PostgresService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DatabaseManager {

    private final DatabaseServiceMongo databaseServiceMongo;
    private final PostgresService postgresService;

    public DataBaseService specifyDatabaseService(DatabaseType databaseType) {
        switch (databaseType) {
            case MONGODB:
                return databaseServiceMongo;
            case POSTGRESQL:
                return postgresService;
            default:
                throw new IllegalStateException("elo");
        }
    }

}