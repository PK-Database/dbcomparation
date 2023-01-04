package com.dbanalyzer.dbpkproject.database.mongo.repository;

import com.dbanalyzer.dbpkproject.database.mongo.entity.TableTwo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRepositoryTableTwo extends MongoRepository<TableTwo, Long> {
}
