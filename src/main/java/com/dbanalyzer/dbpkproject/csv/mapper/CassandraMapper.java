package com.dbanalyzer.dbpkproject.csv.mapper;

import com.dbanalyzer.dbpkproject.csv.dto.MovieDto;
import com.dbanalyzer.dbpkproject.database.cassandra.entity.Movie;
import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.enums.ChooseConfig;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class CassandraMapper {

    public List<Movie> mapToEntitiesList(List<MovieDto> dtos) {
        JMapper<Movie, MovieDto> accidentMapper = new JMapper<>
                (Movie.class, MovieDto.class, ChooseConfig.DESTINATION);

        return dtos.stream()
                .map(accidentMapper::getDestination)
                .collect(toList());
    }

    public List<MovieDto> mapToDtoList(List<Movie> dtos) {
        JMapper<MovieDto, Movie> accidentMapper = new JMapper<>
                (MovieDto.class, Movie.class, ChooseConfig.DESTINATION);

        return dtos.stream()
                .map(accidentMapper::getDestination)
                .collect(toList());
    }
}
