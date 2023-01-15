package com.dbanalyzer.dbpkproject.database.cassandra.services;

import com.dbanalyzer.dbpkproject.controllers.enums.QueryType;
import com.dbanalyzer.dbpkproject.csv.dto.MovieDto;
import com.dbanalyzer.dbpkproject.csv.mapper.CassandraMapper;
import com.dbanalyzer.dbpkproject.database.cassandra.entity.Movie;
import com.dbanalyzer.dbpkproject.database.cassandra.repository.CassandraMovieRepository;
import com.dbanalyzer.dbpkproject.database.cassandra.usertypes.MovieGenre;
import com.dbanalyzer.dbpkproject.manager.DataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CassandraService implements DataBaseService {
    private final CassandraMovieRepository movieRepository;
    private final CassandraMapper cassandraMapper;

    @Autowired
    public CassandraService(CassandraMovieRepository movieRepository,
                            CassandraMapper cassandraMapper) {
        this.movieRepository = movieRepository;
        this.cassandraMapper = cassandraMapper;
    }

    public void saveMovies(List<? extends Object> movieList) {
        movieRepository.saveAll((List<Movie>) movieList);
    }

    @Override
    public Collection<MovieDto> getMovies() {
        return cassandraMapper.mapToDtoList(movieRepository.findAll());
    }

    @Override
    public Collection<MovieDto> executeQuery(QueryType queryType) {
        return switch (queryType) {
            case CREATE -> null;
            case READ -> select();
            case UPDATE -> update();
            case DELETE -> delete();
            case DELETE_ALL -> deleteAll();
        };
    }



    /*
    * select * from public.movies as mo \n" +
            "inner join public.movies_directors as md on mo.id = md.movie_id\n" +
            "inner join public.directors as di on di.id = md.directors_id\n" +
            "inner join public.directors_genres as dg on dg.id = di.id\n" +
            "where mo.year >= 2000 and mo.year <= 2005 and dg.genre LIKE '%me
    */


    private List<MovieDto> select() {
        List<Movie> movies = movieRepository.findAllByYearBetween(2000, 2005)
                .stream().filter(movie -> movie.getDirectors().stream().filter(director -> director.getDirectorGenre().getGenre().endsWith("me")).toList().size() >= 1).toList();
        return cassandraMapper.mapToDtoList(movies);
    }

    /**
     * Update movie genre set to 'Cartoon' where genre 'Animation' and movie year less than 2000
    * */
    private List<MovieDto> update() {
        List<Movie> updated = movieRepository.findAllByYearLessThan(2000)
                .stream()
                .filter(movie -> movie.getMovieGenres().stream().filter(movieGenre -> movieGenre.getGenre().equals("Animation")).toList().size() >= 1)
                .map(movie -> {
                Set<MovieGenre> genres = movie.getMovieGenres();
                List<MovieGenre> animation = movie.getMovieGenres().stream().filter(movieGenre -> movieGenre.getGenre().equals("Animation")).toList();
                MovieGenre genre = animation.get(0);
                genres.remove(genre);
                genre.setGenre("Cartoon");
                genres.add(genre);

                movie.setMovieGenres(genres);

                return movie;
            }).toList();

        movieRepository.deleteAllById(updated.stream().map(Movie::getId).collect(Collectors.toList()));
        movieRepository.saveAll(updated);
        return cassandraMapper.mapToDtoList(updated);
    }

    private List<MovieDto> delete() {
        List<Movie> movies = movieRepository.findAllByYearBetween(1910, 1950);
        movieRepository.deleteAllById(movies.stream().map(Movie::getId).toList());

        return cassandraMapper.mapToDtoList(movies);
    }

    private List<MovieDto> deleteAll() {
        movieRepository.deleteAll();
        return null;
    }

}