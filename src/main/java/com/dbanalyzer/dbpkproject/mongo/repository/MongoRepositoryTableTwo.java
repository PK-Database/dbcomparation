package com.dbanalyzer.dbpkproject.mongo.repository;

import com.dbanalyzer.dbpkproject.mongo.entity.TableTwo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRepositoryTableTwo extends MongoRepository<TableTwo, Long> {
}
