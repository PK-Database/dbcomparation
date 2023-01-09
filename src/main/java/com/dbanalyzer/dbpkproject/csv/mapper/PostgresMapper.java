package com.dbanalyzer.dbpkproject.csv.mapper;

import com.dbanalyzer.dbpkproject.csv.dto.MovieDto;
import com.dbanalyzer.dbpkproject.database.postgres.entity.Movie;
import com.googlecode.jmapper.JMapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class PostgresMapper {

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

    public List<MovieDto> mapToDtoListMM(List<Movie> dtos) {

        return dtos.stream()
                .map(this::mapToDto)
                .collect(toList());
    }

    public MovieDto mapToDto(Movie dto) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setAmbiguityIgnored(true);

        return modelMapper.map(dto, MovieDto.class);
    }


}