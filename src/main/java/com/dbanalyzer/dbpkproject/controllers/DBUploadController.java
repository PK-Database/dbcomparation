package com.dbanalyzer.dbpkproject.controllers;

import com.dbanalyzer.dbpkproject.controllers.enums.DatabaseType;
import com.dbanalyzer.dbpkproject.manager.DatabaseManager;
import com.dbanalyzer.dbpkproject.manager.UploadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class DBUploadController {

    private final DatabaseManager databaseManager;
    private final UploadService uploadService;

    @PostMapping("/upload")
    public ResponseEntity<?> getResultsForQuery(@RequestParam DatabaseType databaseType) {
        uploadService.performDatabaseUpload(databaseManager.specifyDatabaseService(databaseType));

        return ResponseEntity.ok().build();
    }

}