package com.dbanalyzer.dbpkproject.database.mongo.repository;

import com.dbanalyzer.dbpkproject.database.mongo.entity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoMovieRepository extends MongoRepository<Movie, Long> {
}
