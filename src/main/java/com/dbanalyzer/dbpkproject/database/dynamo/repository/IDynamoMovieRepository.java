package com.dbanalyzer.dbpkproject.database.dynamo.repository;

import com.dbanalyzer.dbpkproject.database.dynamo.entity.Movie;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableScan
public interface IDynamoMovieRepository extends CrudRepository<Movie, String> {

    List<Movie> findAll();

}