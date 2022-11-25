package com.dbanalyzer.dbpkproject.postgres.services;

import com.dbanalyzer.dbpkproject.postgres.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class PostgresRepositoryFactory {

    private final PostgresRepositoryTableThree postgresRepositoryTableThree;

    private final PostgresRepositoryTableEight postgresRepositoryTableEight;

    private final PostgresRepositoryTableTwo postgresRepositoryTableTwo;

    private final PostgresRepositoryTableFour postgresRepositoryTableFour;

    private final PostgresRepositoryTableOne postgresRepositoryTableOne;

    private final PostgresRepositoryTableFive postgresRepositoryTableFive;

    private final PostgresRepositoryTableSix postgresRepositoryTableSix;

    private final PostgresRepositoryTableSeven postgresRepositoryTableSeven;


    public JpaRepository getRepository(Class clazz){

        switch (clazz.getName()){
            case "com.dbanalyzer.dbpkproject.postgres.entity.TableOne":
                return postgresRepositoryTableOne;
            case "com.dbanalyzer.dbpkproject.postgres.entity.TableTwo":
                return postgresRepositoryTableTwo;
            case "com.dbanalyzer.dbpkproject.postgres.entity.TableThree":
                return postgresRepositoryTableThree;
            case "com.dbanalyzer.dbpkproject.postgres.entity.TableFour":
                return postgresRepositoryTableFour;
            case "com.dbanalyzer.dbpkproject.postgres.entity.TableFive":
                return postgresRepositoryTableFive;
            case "com.dbanalyzer.dbpkproject.postgres.entity.TableSix":
                return postgresRepositoryTableSix;
            case "com.dbanalyzer.dbpkproject.postgres.entity.TableSeven":
                return postgresRepositoryTableSeven;
            case "com.dbanalyzer.dbpkproject.postgres.entity.TableEight":
                return postgresRepositoryTableEight;
            default:
                throw new IllegalStateException("Operation not supported");
        }
    }

}
