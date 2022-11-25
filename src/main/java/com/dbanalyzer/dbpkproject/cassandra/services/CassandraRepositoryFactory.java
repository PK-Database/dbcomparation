package com.dbanalyzer.dbpkproject.cassandra.services;

import com.dbanalyzer.dbpkproject.cassandra.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class CassandraRepositoryFactory {

    private final CassandraRepositoryTableOne cassandraRepositoryTableOne;
    private final CassandraRepositoryTableTwo cassandraRepositoryTableTwo;
    private final CassandraRepositoryTableThree cassandraRepositoryTableThree;
    private final CassandraRepositoryTableFour cassandraRepositoryTableFour;
    private final CassandraRepositoryTableFive cassandraRepositoryTableFive;
    private final CassandraRepositoryTableSix cassandraRepositoryTableSix;
    private final CassandraRepositoryTableSeven cassandraRepositoryTableSeven;
    private final CassandraRepositoryTableEight cassandraRepositoryTableEight;

    public CassandraRepository getRepository(Class clazz){

        switch (clazz.getName()){
            case "com.dbanalyzer.dbpkproject.cassandra.entity.TableOne":
                return cassandraRepositoryTableOne;
            case "com.dbanalyzer.dbpkproject.cassandra.entity.TableTwo":
                return cassandraRepositoryTableTwo;
            case "com.dbanalyzer.dbpkproject.cassandra.entity.TableThree":
                return cassandraRepositoryTableThree;
            case "com.dbanalyzer.dbpkproject.cassandra.entity.TableFour":
                return cassandraRepositoryTableFour;
            case "com.dbanalyzer.dbpkproject.cassandra.entity.TableFive":
                return cassandraRepositoryTableFive;
            case "com.dbanalyzer.dbpkproject.cassandra.entity.TableSix":
                return cassandraRepositoryTableSix;
            case "com.dbanalyzer.dbpkproject.cassandra.entity.TableSeven":
                return cassandraRepositoryTableSeven;
            case "com.dbanalyzer.dbpkproject.cassandra.entity.TableEight":
                return cassandraRepositoryTableEight;
            default:
                throw new IllegalStateException("Operation not supported");
        }
    }
}
