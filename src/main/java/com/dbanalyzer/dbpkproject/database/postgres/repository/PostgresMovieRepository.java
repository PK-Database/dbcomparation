package com.dbanalyzer.dbpkproject.database.postgres.repository;

import com.dbanalyzer.dbpkproject.database.postgres.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
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

    @Query(value = "select * from public.movies as mo \n" +
            "inner join public.movies_directors as md on mo.id = md.movie_id\n" +
            "inner join public.directors as di on di.id = md.directors_id\n" +
            "inner join public.directors_genres as dg on dg.id = di.id\n" +
            "where mo.year >= 2000 and mo.year <= 2005 and dg.genre LIKE '%me'", nativeQuery = true)
    List<Movie> getMoviesCreatedBetween2000and2005();
}