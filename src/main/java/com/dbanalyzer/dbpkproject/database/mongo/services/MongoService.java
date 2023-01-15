package com.dbanalyzer.dbpkproject.database.mongo.services;

import com.dbanalyzer.dbpkproject.controllers.enums.QueryType;
import com.dbanalyzer.dbpkproject.csv.dto.MovieDto;
import com.dbanalyzer.dbpkproject.csv.mapper.MongoMapper;
import com.dbanalyzer.dbpkproject.database.mongo.entity.Movie;
import com.dbanalyzer.dbpkproject.database.mongo.repository.MongoMovieRepository;
import com.dbanalyzer.dbpkproject.manager.DataBaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MongoService implements DataBaseService {

    private final MongoMovieRepository movieRepository;
    private final MongoMapper mongoMapper;

    @Override
    public Collection<MovieDto> getMovies() {
        return mongoMapper.mapToDtoList(movieRepository.findAll());
    }

    @Override
    public void saveMovies(List<?> moviesList) {
        movieRepository.saveAll((List<Movie>) moviesList);
    }

    @Override
    public Collection<MovieDto> executeQuery(QueryType queryType) {
        return switch (queryType) {
            case CREATE -> null;
            case READ -> mongoMapper.mapToDtoList(movieRepository.findByYearBetweenAndDirectors());
            case UPDATE -> null;
            case DELETE -> delete();
            case DELETE_ALL -> deleteAll();
        };
    }

    private List<MovieDto> delete() {
        return mongoMapper.mapToDtoList(movieRepository.deleteAllByYearBetween(1910, 1950));
    }

    private List<MovieDto> deleteAll() {
        movieRepository.deleteAll();
        return null;
    }

}