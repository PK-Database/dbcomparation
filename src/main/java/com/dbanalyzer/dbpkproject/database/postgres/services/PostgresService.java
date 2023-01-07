package com.dbanalyzer.dbpkproject.database.postgres.services;

import com.dbanalyzer.dbpkproject.csv.dto.MovieDto;
import com.dbanalyzer.dbpkproject.csv.mapper.PostgresMapper;
import com.dbanalyzer.dbpkproject.database.postgres.repository.PostgresMovieRepository;
import com.dbanalyzer.dbpkproject.manager.DataBaseService;
/*import com.dbanalyzer.dbpkproject.csv.dto.AccidentDto;
import com.dbanalyzer.dbpkproject.csv.mapper.PostgresMapper;
import com.dbanalyzer.dbpkproject.database.postgres.entity.Accident;
import com.dbanalyzer.dbpkproject.database.postgres.repository.IAccidentRepository;*/
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PostgresService implements DataBaseService {

    private final PostgresMapper postgresMapper;
    private final PostgresMovieRepository movieRepository;
    public PostgresService(PostgresMapper postgresMapper, PostgresMovieRepository movieRepository) {
        this.postgresMapper = postgresMapper;
        this.movieRepository = movieRepository;
    }

    @Override
    public Collection<MovieDto> getMovies() {
        return postgresMapper.mapToDtoList(movieRepository.findAll());
    }
}