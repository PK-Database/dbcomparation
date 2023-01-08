package com.dbanalyzer.dbpkproject.csv.mapper;

import com.dbanalyzer.dbpkproject.csv.dto.ActorDto;
import com.dbanalyzer.dbpkproject.csv.dto.DirectorDto;
import com.dbanalyzer.dbpkproject.csv.dto.MovieDto;
import com.dbanalyzer.dbpkproject.database.postgres.entity.Actor;
import com.dbanalyzer.dbpkproject.database.postgres.entity.Director;
import com.dbanalyzer.dbpkproject.database.postgres.entity.Movie;
import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.enums.ChooseConfig;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class PostgresMapper {

    public Actor mapActorToEntity(ActorDto dto) {
        JMapper<Actor, ActorDto> actorMapper = new JMapper<>
                (Actor.class, ActorDto.class, ChooseConfig.DESTINATION);

        return actorMapper.getDestination(dto);
    }
    public Director mapDirectorToEntity(DirectorDto dto) {
        JMapper<Director, DirectorDto> directorMapper = new JMapper<>
                (Director.class, DirectorDto.class, ChooseConfig.DESTINATION);

        return directorMapper.getDestination(dto);
    }
    public List<Movie> mapToEntitiesList(List<MovieDto> dtos) {
        JMapper<Movie, MovieDto> movieMapper = new JMapper<>
                (Movie.class, MovieDto.class, ChooseConfig.DESTINATION);

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