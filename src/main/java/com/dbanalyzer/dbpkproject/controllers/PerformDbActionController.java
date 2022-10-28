package com.dbanalyzer.dbpkproject.controllers;

import com.dbanalyzer.dbpkproject.controllers.dto.RequestDbResultsDto;
import com.dbanalyzer.dbpkproject.manager.CsvFileToObjectConverter;
import com.dbanalyzer.dbpkproject.manager.DatabaseManager;
import com.dbanalyzer.dbpkproject.manager.dto.MasterObject;
import com.opencsv.exceptions.CsvValidationException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
@RequestMapping("/perform")
public class PerformDbActionController {

    private final DatabaseManager databaseManager;
    private final CsvFileToObjectConverter csvFileToObjectConverter;

    @PostMapping("/query")
    public ResponseEntity<?> getResultsForQuery(@RequestBody RequestDbResultsDto requestDbResultsDto){
        return ResponseEntity.ok().body(databaseManager.specifyDatabaseService(requestDbResultsDto).getUsers());
    }

    @PostMapping(value = "/upload")
    public ResponseEntity<?> uploadCsvRowsToDatabase(@RequestPart("file") MultipartFile csvFile) throws IOException, CsvValidationException {
        csvFileToObjectConverter.generateMasterObjectCollection(MasterObject.class ,csvFile);
        return ResponseEntity.ok().body("ok");
    }
}
