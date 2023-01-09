package com.dbanalyzer.dbpkproject.manager;

import com.dbanalyzer.dbpkproject.controllers.enums.QueryType;
import com.dbanalyzer.dbpkproject.csv.dto.MovieDto;

import java.util.Collection;

public interface DataBaseService {
    Collection<MovieDto> getMovies();

    Collection<MovieDto> executeQuery(QueryType queryType);
}