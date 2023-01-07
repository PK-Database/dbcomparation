package com.dbanalyzer.dbpkproject.controllers;

import com.dbanalyzer.dbpkproject.controllers.enums.DatabaseType;
import com.dbanalyzer.dbpkproject.manager.DatabaseManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
@RequestMapping("/perform")
public class PerformDbActionController {

    private final DatabaseManager databaseManager;

    @PostMapping("/query")
    public ResponseEntity<?> getResultsForQuery(@RequestBody DatabaseType databaseType){
        return ResponseEntity.ok().body(databaseManager.specifyDatabaseService(databaseType).getMovies());
    }
}
