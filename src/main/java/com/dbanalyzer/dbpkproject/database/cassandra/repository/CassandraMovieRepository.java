package com.dbanalyzer.dbpkproject.database.cassandra.repository;

import com.dbanalyzer.dbpkproject.database.cassandra.entity.Movie;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface CassandraMovieRepository extends CassandraRepository<Movie, Long> {
}
