package com.dbanalyzer.dbpkproject.database.postgres.services;

import com.dbanalyzer.dbpkproject.csv.dto.MovieDto;
import com.dbanalyzer.dbpkproject.csv.mapper.PostgresMapper;
import com.dbanalyzer.dbpkproject.database.postgres.entity.Actor;
import com.dbanalyzer.dbpkproject.database.postgres.entity.Director;
import com.dbanalyzer.dbpkproject.database.postgres.entity.Movie;
import com.dbanalyzer.dbpkproject.database.postgres.repository.PostgresActorRepository;
import com.dbanalyzer.dbpkproject.database.postgres.repository.PostgresDirectorRepository;
import com.dbanalyzer.dbpkproject.database.postgres.repository.PostgresMovieRepository;
import com.dbanalyzer.dbpkproject.manager.DataBaseService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostgresService implements DataBaseService {

    private final PostgresMapper postgresMapper;
    private final PostgresMovieRepository movieRepository;
    private final PostgresActorRepository actorRepository;
    private final PostgresDirectorRepository directorRepository;

    public PostgresService(PostgresMapper postgresMapper, PostgresMovieRepository movieRepository, PostgresActorRepository actorRepository, PostgresDirectorRepository directorRepository) {
        this.postgresMapper = postgresMapper;
        this.movieRepository = movieRepository;
        this.actorRepository = actorRepository;
        this.directorRepository = directorRepository;
    }

    @Override
    public void save(List<MovieDto> movies) {
        List<Director> directors = movies.stream()
                .map(MovieDto::getDirectors)
                .flatMap(Collection::stream)
                .distinct()
                .map(postgresMapper::mapDirectorToEntity)
                .collect(Collectors.toList());

        List<Actor> actors = movies.stream()
           .map(MovieDto::getActors)
           .flatMap(Collection::stream)
           .distinct()
           .map(postgresMapper::mapActorToEntity)
           .collect(Collectors.toList());

        directorRepository.saveAll(directors);
        actorRepository.saveAll(actors);
        movieRepository.saveAll(postgresMapper.mapToEntitiesList(movies));
    }

    @Override
    public Collection<Object> getMovies() {
        return Collections.singleton(postgresMapper.mapToDtoList(movieRepository.findAll()));
    }

    public List<MovieDto> findAllMovies() {
        List<Movie> entities = movieRepository.findTop10By();
        return postgresMapper.mapToDtoList(entities);
    }

}