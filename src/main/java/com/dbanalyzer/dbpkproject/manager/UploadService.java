package com.dbanalyzer.dbpkproject.manager;

import com.dbanalyzer.dbpkproject.csv.dto.MovieDto;
import com.dbanalyzer.dbpkproject.database.postgres.services.PostgresService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UploadService {

    private final PostgresService postgresService;

    public UploadService(PostgresService postgresService) {
        this.postgresService = postgresService;
    }

    public void performDatabaseUpload(DataBaseService dataBaseService) {
        List<MovieDto> dtos = postgresService.findAllMovies();

        System.out.println("DONBE");
    }

}