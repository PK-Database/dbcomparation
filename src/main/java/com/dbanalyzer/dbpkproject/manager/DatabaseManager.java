package com.dbanalyzer.dbpkproject.manager;

import com.dbanalyzer.dbpkproject.controllers.dto.RequestDbResultsDto;
import com.dbanalyzer.dbpkproject.mongo.services.DatabaseServiceMongo;
import com.dbanalyzer.dbpkproject.postgres.services.DatabaseServicePostgres;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DatabaseManager {

    private final DatabaseServiceMongo databaseServiceMongo;
    private final DatabaseServicePostgres databaseServicePostgres;

    public DataBaseService specifyDatabaseService(RequestDbResultsDto requestDbResultsDto){
        switch (requestDbResultsDto.getDatabaseType()){
            case MONGODB:
                return databaseServiceMongo;
            case POSTGRESQL:
                return databaseServicePostgres;
            default:
                throw new IllegalStateException("elo");
        }
    }


}
