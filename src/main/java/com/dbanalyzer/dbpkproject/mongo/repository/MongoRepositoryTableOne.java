package com.dbanalyzer.dbpkproject.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoExampleRepo extends MongoRepository<User, Long> {
}
