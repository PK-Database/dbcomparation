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

    private final MongoMovieRepository mongoMovieRepository;
    private final MongoMapper mongoMapper;

    @Override
    public Collection<MovieDto> getMovies() {
        return mongoMapper.mapToDtoList(mongoMovieRepository.findAll());
    }

    @Override
    public void saveMovies(List<?> moviesList) {
        mongoMovieRepository.deleteAll();
        mongoMovieRepository.saveAll((List<Movie>) moviesList);
    }

    @Override
    public Collection<MovieDto> executeQuery(QueryType queryType) {
        return null;
    }
}
