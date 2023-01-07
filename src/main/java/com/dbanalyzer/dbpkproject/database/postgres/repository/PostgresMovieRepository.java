package com.dbanalyzer.dbpkproject.database.postgres.repository;

import com.dbanalyzer.dbpkproject.database.postgres.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostgresMovieRepository extends JpaRepository<Movie, Long> {
}
