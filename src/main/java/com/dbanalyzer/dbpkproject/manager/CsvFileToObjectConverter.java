package com.dbanalyzer.dbpkproject.manager;

import com.dbanalyzer.dbpkproject.manager.dto.MasterObject;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class CsvFileToObjectConverter {

    public <T> List<MasterObject> generateMasterObjectCollection(Class<T> type, MultipartFile multipartFile) throws IOException {

        List<MasterObject> masterObjects = new ArrayList<>();

        CsvSchema csvSchema = CsvSchema.emptySchema().withHeader().withColumnSeparator(';');

        ObjectReader mapper = new CsvMapper().readerFor(MasterObject.class).with(csvSchema);

        MappingIterator<MasterObject> iterator = mapper.readValues(new BufferedReader(new InputStreamReader(multipartFile.getInputStream())));

        int i = 1;
        while(iterator.hasNext()){
            MasterObject masterObject = iterator.next();
            masterObjects.add(masterObject);
            log.info(i + " :::::" + masterObject.getCity() + " " + masterObject.getDescription());
            i++;
        }
        return masterObjects;
    }
}
