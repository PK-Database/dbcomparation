package com.dbanalyzer.dbpkproject.database.cassandra.repository;

import com.dbanalyzer.dbpkproject.database.cassandra.entity.Accident;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ICassandraAccidentRepository extends CassandraRepository<Accident, String> {
}