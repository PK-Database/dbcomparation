package com.dbanalyzer.dbpkproject.database.cassandra.services;

import com.dbanalyzer.dbpkproject.csv.dto.MovieDto;
import com.dbanalyzer.dbpkproject.csv.mapper.CassandraMapper;
import com.dbanalyzer.dbpkproject.database.cassandra.repository.CassandraMovieRepository;
import com.dbanalyzer.dbpkproject.database.cassandra.entity.Movie;
import com.dbanalyzer.dbpkproject.manager.DataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

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

    public void save(List<Movie> movies) {
        movieRepository.deleteAll();
        movieRepository.saveAll(movies);
    }
    @Override
    public Collection<MovieDto> getMovies() {
        return cassandraMapper.mapToDtoList(movieRepository.findAll());
    }

}