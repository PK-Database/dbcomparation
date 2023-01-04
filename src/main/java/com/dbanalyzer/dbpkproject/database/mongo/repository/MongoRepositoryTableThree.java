package com.dbanalyzer.dbpkproject.database.mongo.repository;

import com.dbanalyzer.dbpkproject.database.mongo.entity.TableThree;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRepositoryTableThree extends MongoRepository<TableThree, Long> {
}
