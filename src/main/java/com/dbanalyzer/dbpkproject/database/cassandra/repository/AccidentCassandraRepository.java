package com.dbanalyzer.dbpkproject.database.cassandra.repository;

import com.dbanalyzer.dbpkproject.database.cassandra.entity.Accident;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface AccidentCassandraRepository extends CassandraRepository<Accident, String> {
}