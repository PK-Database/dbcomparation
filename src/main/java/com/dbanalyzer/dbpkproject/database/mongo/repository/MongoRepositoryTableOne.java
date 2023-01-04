package com.dbanalyzer.dbpkproject.database.mongo.repository;

import com.dbanalyzer.dbpkproject.database.mongo.entity.TableOne;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRepositoryTableOne extends MongoRepository<TableOne, Long> {
}
