package com.dbanalyzer.dbpkproject.csv.mapper;

import com.dbanalyzer.dbpkproject.csv.dto.MovieDto;
import com.dbanalyzer.dbpkproject.database.dynamo.entity.Movie;
import com.googlecode.jmapper.JMapper;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class DynamoMapper {

    public List<Movie> mapToEntitiesList(List<MovieDto> dtos) {
        JMapper<Movie, MovieDto> movieMapper = new JMapper<>
                (Movie.class, MovieDto.class);

        return dtos.stream()
                .map(movieMapper::getDestination)
                .collect(toList());
    }

    public List<MovieDto> mapToDtoList(List<Movie> dtos) {
        JMapper<MovieDto, Movie> movieMapper = new JMapper<>
                (MovieDto.class, Movie.class);

        return dtos.stream()
                .map(movieMapper::getDestination)
                .collect(toList());
    }

}