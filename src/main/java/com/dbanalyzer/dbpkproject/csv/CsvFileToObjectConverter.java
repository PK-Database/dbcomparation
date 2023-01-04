package com.dbanalyzer.dbpkproject.csv;

import com.dbanalyzer.dbpkproject.csv.dto.AccidentDto;
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

    public List<AccidentDto> convertAccidents(MultipartFile multipartFile) throws IOException {
        CsvSchema csvSchema = CsvSchema.emptySchema().withHeader().withColumnSeparator(';');
        ObjectReader mapper = new CsvMapper().readerFor(AccidentDto.class).with(csvSchema);
        MappingIterator<AccidentDto> iterator = mapper.readValues(new BufferedReader(new InputStreamReader(multipartFile.getInputStream())));

        List<AccidentDto> accidentDtos = new ArrayList<>();
        while (iterator.hasNext()) {
            AccidentDto accidentDto = iterator.next();
            accidentDtos.add(accidentDto);
        }
        return accidentDtos;
    }
}
