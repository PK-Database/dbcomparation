package com.dbanalyzer.dbpkproject.database.mongo.services;

import com.dbanalyzer.dbpkproject.database.mongo.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class MongoRepositoryFactoryImpl {

    private final MongoRepositoryTableOne mongoRepositoryTableOne;

    private final MongoRepositoryTableTwo mongoRepositoryTableTwo;

    private final MongoRepositoryTableThree mongoRepositoryTableThree;

    private final MongoRepositoryTableFour mongoRepositoryTableFour;

    private final MongoRepositoryTableFive mongoRepositoryTableFive;

    private final MongoRepositoryTableSix mongoRepositoryTableSix;

    private final MongoRepositoryTableSeven mongoRepositoryTableSeven;

    private final MongoRepositoryTableEight mongoRepositoryTableEight;

    public MongoRepository getRepository(Class clazz){

        switch (clazz.getName()){
            case "com.dbanalyzer.dbpkproject.mongo.entity.TableOne":
                return mongoRepositoryTableOne;
            case "com.dbanalyzer.dbpkproject.mongo.entity.TableTwo":
                return mongoRepositoryTableTwo;
            case "com.dbanalyzer.dbpkproject.mongo.entity.TableThree":
                return mongoRepositoryTableThree;
            case "com.dbanalyzer.dbpkproject.mongo.entity.TableFour":
                return mongoRepositoryTableFour;
            case "com.dbanalyzer.dbpkproject.mongo.entity.TableFive":
                return mongoRepositoryTableFive;
            case "com.dbanalyzer.dbpkproject.mongo.entity.TableSix":
                return mongoRepositoryTableSix;
            case "com.dbanalyzer.dbpkproject.mongo.entity.TableSeven":
                return mongoRepositoryTableSeven;
            case "com.dbanalyzer.dbpkproject.mongo.entity.TableEight":
                return mongoRepositoryTableEight;
            default:
                throw new IllegalStateException("Operation not supported");
        }
    }
}
