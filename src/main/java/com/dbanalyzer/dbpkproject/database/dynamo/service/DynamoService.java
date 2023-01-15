package com.dbanalyzer.dbpkproject.database.dynamo.service;

import com.dbanalyzer.dbpkproject.controllers.enums.QueryType;
import com.dbanalyzer.dbpkproject.csv.dto.MovieDto;
import com.dbanalyzer.dbpkproject.csv.mapper.DynamoMapper;
import com.dbanalyzer.dbpkproject.database.dynamo.entity.Director;
import com.dbanalyzer.dbpkproject.database.dynamo.entity.DirectorGenre;
import com.dbanalyzer.dbpkproject.database.dynamo.entity.Movie;
import com.dbanalyzer.dbpkproject.database.dynamo.repository.IDynamoMovieRepository;
import com.dbanalyzer.dbpkproject.manager.DataBaseService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DynamoService implements DataBaseService {

    private final IDynamoMovieRepository movieRepository;
    private final DynamoMapper dynamoMapper;

    public DynamoService(IDynamoMovieRepository movieRepository, DynamoMapper dynamoMapper) {
        this.movieRepository = movieRepository;
        this.dynamoMapper = dynamoMapper;
    }

    public List<Movie> getAll() {
        return movieRepository.findAll();
    }

    public void saveMovies(List<? extends Object> movieList) {
        movieRepository.saveAll((List<Movie>) movieList);
    }

    @Override
    public Collection<MovieDto> getMovies() {
        return dynamoMapper.mapToDtoList(movieRepository.findAll());
    }

    @Override
    public Collection<MovieDto> executeQuery(QueryType queryType) {
        System.out.println("hehe dynamo");
        return switch (queryType) {
            case CREATE -> null;
            case READ -> getDynamoEntities();
            case UPDATE -> updateQuery();
            case DELETE -> delete();
            case DELETE_ALL -> deleteAll();
        };
    }

    private Collection<MovieDto> updateQuery() {
        Collection<Movie> movies = movieRepository.findAllByYearIsLessThan(2000);
        Collection<Movie> moviesToUpdate = movies.stream()
                .filter(el -> el.getMovieGenres().stream()
                        .anyMatch(ele -> ele.getGenre().equals("Animation")))
                .collect(Collectors.toList());

        movieRepository.deleteAll(moviesToUpdate);

        moviesToUpdate.forEach(el -> el.getMovieGenres().stream().filter(ele -> ele.getGenre().equals("Animation")).forEach(movieGenre -> movieGenre.setGenre("Cartoon")));

        movieRepository.saveAll(moviesToUpdate);

        return Collections.emptyList();
    }

    private List<MovieDto> delete() {
        List<Movie> movies = movieRepository.findAllByRolesNotNull()
                .stream()
                .filter(movie -> movie.getRoles().stream().filter(role -> role.getActor().getLastName().startsWith("F")).toList().size() >= 1)
                .toList();

        movieRepository.deleteAll(movies);

        return dynamoMapper.mapToDtoList(movies);
    }

    private List<MovieDto> deleteAll() {
        movieRepository.deleteAll();
        return null;
    }

    private List<MovieDto> getDynamoEntities() {
        return dynamoMapper.mapToDtoList(
                movieRepository.findMoviesByYearIsBetween(2000, 2005)
                        .stream()
                        .filter(el -> el.getDirectors().stream().
                                map(Director::getDirectorGenre)
                                .map(DirectorGenre::getGenre)
                                .anyMatch(ele -> ele.contains("Cri")))
                        .collect(Collectors.toList())
        );
    }

}