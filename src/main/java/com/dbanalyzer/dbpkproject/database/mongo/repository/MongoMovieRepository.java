package com.dbanalyzer.dbpkproject.database.mongo.repository;

import com.dbanalyzer.dbpkproject.database.mongo.entity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MongoMovieRepository extends MongoRepository<Movie, Long> {
    List<Movie> deleteAllByYearBetween(Integer from, Integer to);

    @Query("{'year': { $gte: 2000, $lte: 2005 }, 'directors.directorGenre.genre': 'Crime'}")
    List<Movie> findByYearBetweenAndDirectors();

    List<Movie> findAllByRolesNotNull();
}
