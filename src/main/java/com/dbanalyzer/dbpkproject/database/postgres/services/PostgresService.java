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
        System.out.println("hehe postgres");
        return null;
    }

    public void save(List<Movie> movieList) {
        movieRepository.deleteAll();
        movieRepository.saveAll(movieList);
    }

}