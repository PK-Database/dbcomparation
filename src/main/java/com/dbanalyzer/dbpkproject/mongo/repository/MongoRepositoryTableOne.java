package com.dbanalyzer.dbpkproject.mongo.repository;

import com.dbanalyzer.dbpkproject.mongo.entity.TableOne;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRepositoryTableOne extends MongoRepository<TableOne, Long> {
}
