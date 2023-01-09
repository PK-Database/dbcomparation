package com.dbanalyzer.dbpkproject.controllers;

import com.dbanalyzer.dbpkproject.controllers.enums.DatabaseType;
import com.dbanalyzer.dbpkproject.controllers.enums.QueryType;
import com.dbanalyzer.dbpkproject.manager.DatabaseManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
@RequestMapping("/database")
public class PerformDbActionController {

    private final DatabaseManager databaseManager;

    @PostMapping("/getAll")
    public ResponseEntity<?> getResultsForQuery(@RequestParam DatabaseType databaseType){
        return ResponseEntity.ok().body(databaseManager.specifyDatabaseService(databaseType).getMovies());
    }

    @PostMapping("/query")
    public ResponseEntity<?> getResultsForQuery(@RequestParam DatabaseType databaseType, @RequestParam QueryType queryType){
        return ResponseEntity.ok().body(databaseManager.specifyDatabaseService(databaseType).executeQuery(queryType));
    }
}
