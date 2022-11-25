package com.dbanalyzer.dbpkproject.mongo.repository;

import com.dbanalyzer.dbpkproject.mongo.entity.TableThree;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRepositoryTableThree extends MongoRepository<TableThree, Long> {
}
