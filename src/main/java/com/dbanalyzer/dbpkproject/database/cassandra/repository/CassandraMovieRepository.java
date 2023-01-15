package com.dbanalyzer.dbpkproject.database.cassandra.repository;

import com.dbanalyzer.dbpkproject.database.cassandra.entity.Movie;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;

public interface CassandraMovieRepository extends CassandraRepository<Movie, Long> {

    @AllowFiltering
    List<Movie> findAllByYearBetween(Integer from, Integer to);
}
