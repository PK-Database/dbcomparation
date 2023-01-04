package com.dbanalyzer.dbpkproject.database.dynamo.repository;

import com.dbanalyzer.dbpkproject.database.dynamo.entity.Accident;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableScan
public interface IDynamoAccidentRepository extends CrudRepository<Accident, String> {

    List<Accident> findAll();

}