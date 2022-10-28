package com.dbanalyzer.dbpkproject.manager;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.opencsv.exceptions.CsvValidationException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class CsvFileToObjectConverter {

    private static final int batchSize = 10000;

    public <T> void generateMasterObjectCollection(Class<T> type, MultipartFile multipartFile) throws IOException, CsvValidationException {

//        Scanner scanner = null;
////
////        FileInputStream fileInputStream = (FileInputStream) multipartFile.getInputStream();
////        scanner = new Scanner(fileInputStream, "UTF-8");
////        scanner.nextLine(); //skipping header row
////        while (scanner.hasNextLine()){
////            System.out.println(scanner.nextLine());
////        }

        CsvSchema schema = CsvSchema.emptySchema().withHeader();

        ObjectReader mapper = new CsvMapper().readerFor(type).with(schema);

        MappingIterator<T> it = mapper.readValues(multipartFile.getInputStream());

        UnmodifiableIterator<List<T>> unmodifiableIterator = Iterators.partition(it, batchSize);

        while (unmodifiableIterator.hasNext()){
            PerformDividingObjects<T> performDividingObjects = new PerformDividingObjects<>(unmodifiableIterator.next());
            performDividingObjects.start();
        }
//        while (unmodifiableIterator.hasNext()) {
//            PerformDividingObjects<T> performDividingObjects = new PerformDividingObjects<>(unmodifiableIterator.next());
//            performDividingObjects.start();
//        }
//        while (unmodifiableIterator.hasNext()){
//            log.info(unmodifiableIterator.next());
//        }
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

    }
}
