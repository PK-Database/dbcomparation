package com.dbanalyzer.dbpkproject.database.mongo.repository;

import com.dbanalyzer.dbpkproject.database.mongo.entity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MongoMovieRepository extends MongoRepository<Movie, Long> {
    List<Movie> deleteAllByYearBetween(Integer from, Integer to);

}
