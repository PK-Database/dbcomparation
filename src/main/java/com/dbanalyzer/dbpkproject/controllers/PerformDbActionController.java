package com.dbanalyzer.dbpkproject.controllers;

import com.dbanalyzer.dbpkproject.controllers.dto.RequestDbResultsDto;
import com.dbanalyzer.dbpkproject.manager.DatabaseManager;
import com.dbanalyzer.dbpkproject.manager.DatabaseUploadManager;
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
    private final DatabaseUploadManager databaseUploadManager;

    @PostMapping("/query")
    public ResponseEntity<?> getResultsForQuery(@RequestBody RequestDbResultsDto requestDbResultsDto){
        return ResponseEntity.ok().body(databaseManager.specifyDatabaseService(requestDbResultsDto).getAccidents());
    }

    @PostMapping(value = "/upload")
    public ResponseEntity<?> uploadCsvRowsToDatabase(@RequestPart("file") MultipartFile csvFile) throws IOException {
        databaseUploadManager.performDatabasesUploads(csvFile);
        return ResponseEntity.ok().body("ok");
    }
}
