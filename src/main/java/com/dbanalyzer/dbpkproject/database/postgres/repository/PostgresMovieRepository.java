package com.dbanalyzer.dbpkproject.database.postgres.repository;

import com.dbanalyzer.dbpkproject.database.postgres.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PostgresMovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findTop100000By();

    List<Movie> findTop10By();
    List<Movie> findTop10000By();
    List<Movie> findTop1By();

    List<Movie> findAll();

    @Transactional
    List<Movie> deleteAllByYearBetween(Integer from, Integer to);

}