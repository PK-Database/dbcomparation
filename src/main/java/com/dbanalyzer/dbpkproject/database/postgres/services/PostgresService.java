package com.dbanalyzer.dbpkproject.database.postgres.services;

import com.dbanalyzer.dbpkproject.controllers.enums.QueryType;
import com.dbanalyzer.dbpkproject.csv.dto.MovieDto;
import com.dbanalyzer.dbpkproject.csv.mapper.PostgresMapper;
import com.dbanalyzer.dbpkproject.database.postgres.entity.Movie;
import com.dbanalyzer.dbpkproject.database.postgres.repository.PostgresMovieRepository;
import com.dbanalyzer.dbpkproject.manager.DataBaseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class PostgresService implements DataBaseService {

    private final PostgresMapper postgresMapper;
    private final PostgresMovieRepository movieRepository;

    public PostgresService(PostgresMapper postgresMapper, PostgresMovieRepository movieRepository) {
        this.postgresMapper = postgresMapper;
        this.movieRepository = movieRepository;
    }

    @Override
    public Collection<MovieDto> getMovies() {
        return postgresMapper.mapToDtoList(movieRepository.findAll());
    }

    @Override
    public Collection<MovieDto> executeQuery(QueryType queryType) {
        return switch (queryType) {
            case CREATE -> null;
            case READ -> postgresMapper.mapToDtoList(movieRepository.getMoviesCreatedBetween2000and2005());
            case UPDATE -> updateQuery();
            case DELETE -> delete();
            case DELETE_ALL -> deleteAll();
        };
    }

    private Collection<MovieDto> updateQuery() {
        movieRepository.updateQuery();
        return Collections.emptyList();
    }


    public void saveMovies(List<? extends Object> movieList) {
        movieRepository.saveAll((List<Movie>) movieList);
    }

    private List<MovieDto> delete() {
        movieRepository.deleteAll(movieRepository.getMoviesWithFActor());
        return new ArrayList<>();
    }

    private List<MovieDto> deleteAll() {
        movieRepository.deleteAll();
        return null;
    }

}