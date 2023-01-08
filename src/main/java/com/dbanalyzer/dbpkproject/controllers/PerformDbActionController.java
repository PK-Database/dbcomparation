package com.dbanalyzer.dbpkproject.controllers;

import com.dbanalyzer.dbpkproject.controllers.enums.DatabaseType;
import com.dbanalyzer.dbpkproject.csv.dto.MovieDto;
import com.dbanalyzer.dbpkproject.manager.DatabaseManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/perform")
public class PerformDbActionController {

    private final DatabaseManager databaseManager;

    @PostMapping("/query")
    public ResponseEntity<?> getResultsForQuery(@RequestBody DatabaseType databaseType){
        return ResponseEntity.ok().body(databaseManager.specifyDatabaseService(databaseType).getMovies());
    }

    @PostMapping(value = "/upload")
    public ResponseEntity<?> uploadCsvRowsToDatabase(@RequestParam DatabaseType databaseType, @RequestBody List<MovieDto> movies) {
        databaseManager.specifyDatabaseService(databaseType).save(movies);
        return ResponseEntity.ok().body("ok");
    }
}
