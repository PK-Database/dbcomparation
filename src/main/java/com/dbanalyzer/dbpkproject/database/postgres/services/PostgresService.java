package com.dbanalyzer.dbpkproject.database.postgres.services;

import com.dbanalyzer.dbpkproject.controllers.enums.QueryType;
import com.dbanalyzer.dbpkproject.csv.dto.MovieDto;
import com.dbanalyzer.dbpkproject.csv.mapper.PostgresMapper;
import com.dbanalyzer.dbpkproject.database.postgres.entity.Movie;
import com.dbanalyzer.dbpkproject.database.postgres.repository.PostgresMovieRepository;
import com.dbanalyzer.dbpkproject.manager.DataBaseService;
import org.springframework.stereotype.Service;

import java.util.Collection;
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
            case READ -> null;
            case UPDATE -> null;
            case DELETE -> delete();
        };
    }

    public void saveMovies(List<? extends Object> movieList) {
        movieRepository.deleteAll();
        movieRepository.saveAll((List<Movie>) movieList);
    }

    private List<MovieDto> delete() {
        return postgresMapper.mapToDtoList(movieRepository.deleteAllByYearBetween(1910, 1950));
    }

}