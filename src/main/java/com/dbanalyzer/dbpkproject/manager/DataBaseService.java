package com.dbanalyzer.dbpkproject.manager;

import com.dbanalyzer.dbpkproject.csv.dto.MovieDto;

import java.util.Collection;
import java.util.List;

public interface DataBaseService {
    void save(List<MovieDto> movies);
    Collection<MovieDto> getMovies();

}