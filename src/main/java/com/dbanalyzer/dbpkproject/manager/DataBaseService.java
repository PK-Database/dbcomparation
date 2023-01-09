package com.dbanalyzer.dbpkproject.manager;

import com.dbanalyzer.dbpkproject.controllers.enums.QueryType;
import com.dbanalyzer.dbpkproject.csv.dto.MovieDto;

import java.util.Collection;
import java.util.List;

public interface DataBaseService {
    Collection<MovieDto> getMovies();

    void saveMovies(List<? extends Object> moviesList);

    Collection<MovieDto> executeQuery(QueryType queryType);
}