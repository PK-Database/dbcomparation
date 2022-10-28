package com.dbanalyzer.dbpkproject.mongo.repository;

import com.dbanalyzer.dbpkproject.mongo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoExampleRepo extends MongoRepository<User, Long> {
}
