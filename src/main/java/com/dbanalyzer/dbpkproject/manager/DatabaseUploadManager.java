package com.dbanalyzer.dbpkproject.manager;

import com.dbanalyzer.dbpkproject.manager.dto.MasterObject;
import com.dbanalyzer.dbpkproject.manager.thread.ThreadForTasks;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@Component
public class DatabaseUploadManager {

    private final CsvFileToObjectConverter csvFileToObjectConverter;
    private final PropertiesConverterPostgres propertiesConverterPostgres;
    private final PropertiesConverterMongo propertiesConverterMongo;
    private final PropertiesConverterCassandra propertiesConverterCassandra;

    public void performDatabasesUploads(MultipartFile csvFile) throws IOException {

        List<MasterObject> masterObjectList = csvFileToObjectConverter.generateMasterObjectCollection(MasterObject.class, csvFile);

//        new ThreadForTasks(() -> masterObjectList.forEach(el -> {
//            propertiesConverterMongo.convertAndSave(el, com.dbanalyzer.dbpkproject.mongo.entity.TableOne.class);
//            propertiesConverterMongo.convertAndSave(el, com.dbanalyzer.dbpkproject.mongo.entity.TableTwo.class);
//            propertiesConverterMongo.convertAndSave(el, com.dbanalyzer.dbpkproject.mongo.entity.TableThree.class);
//            propertiesConverterMongo.convertAndSave(el, com.dbanalyzer.dbpkproject.mongo.entity.TableFour.class);
//        })).start();
//
//        new ThreadForTasks(() -> masterObjectList.forEach(el -> {
//            propertiesConverterMongo.convertAndSave(el, com.dbanalyzer.dbpkproject.mongo.entity.TableFive.class);
//            propertiesConverterMongo.convertAndSave(el, com.dbanalyzer.dbpkproject.mongo.entity.TableSix.class);
//            propertiesConverterMongo.convertAndSave(el, com.dbanalyzer.dbpkproject.mongo.entity.TableSeven.class);
//            propertiesConverterMongo.convertAndSave(el, com.dbanalyzer.dbpkproject.mongo.entity.TableEight.class);
//        })).start();
//
//        new ThreadForTasks(() -> masterObjectList.forEach(el -> {
//            propertiesConverterPostgres.convertAndSave(el, com.dbanalyzer.dbpkproject.postgres.entity.TableOne.class);
//            propertiesConverterPostgres.convertAndSave(el, com.dbanalyzer.dbpkproject.postgres.entity.TableTwo.class);
//            propertiesConverterPostgres.convertAndSave(el, com.dbanalyzer.dbpkproject.postgres.entity.TableThree.class);
//            propertiesConverterPostgres.convertAndSave(el, com.dbanalyzer.dbpkproject.postgres.entity.TableFour.class);
//        })).start();
//
//        new ThreadForTasks(() -> masterObjectList.forEach(el -> {
//            propertiesConverterPostgres.convertAndSave(el, com.dbanalyzer.dbpkproject.postgres.entity.TableFive.class);
//            propertiesConverterPostgres.convertAndSave(el, com.dbanalyzer.dbpkproject.postgres.entity.TableSix.class);
//            propertiesConverterPostgres.convertAndSave(el, com.dbanalyzer.dbpkproject.postgres.entity.TableSeven.class);
//            propertiesConverterPostgres.convertAndSave(el, com.dbanalyzer.dbpkproject.postgres.entity.TableEight.class);
//        })).start();

        new ThreadForTasks(() -> masterObjectList.forEach(el -> {
            propertiesConverterCassandra.convertAndSave(el, com.dbanalyzer.dbpkproject.cassandra.entity.TableOne.class);
//            propertiesConverterCassandra.convertAndSave(el, com.dbanalyzer.dbpkproject.cassandra.entity.TableTwo.class);
//            propertiesConverterCassandra.convertAndSave(el, com.dbanalyzer.dbpkproject.cassandra.entity.TableThree.class);
//            propertiesConverterCassandra.convertAndSave(el, com.dbanalyzer.dbpkproject.cassandra.entity.TableFour.class);
        })).start();
//
//        new ThreadForTasks(() -> masterObjectList.forEach(el -> {
//            propertiesConverterCassandra.convertAndSave(el, com.dbanalyzer.dbpkproject.cassandra.entity.TableFive.class);
//            propertiesConverterCassandra.convertAndSave(el, com.dbanalyzer.dbpkproject.cassandra.entity.TableSix.class);
//            propertiesConverterCassandra.convertAndSave(el, com.dbanalyzer.dbpkproject.cassandra.entity.TableSeven.class);
//            propertiesConverterCassandra.convertAndSave(el, com.dbanalyzer.dbpkproject.cassandra.entity.TableEight.class);
//        })).start();

    }
}
