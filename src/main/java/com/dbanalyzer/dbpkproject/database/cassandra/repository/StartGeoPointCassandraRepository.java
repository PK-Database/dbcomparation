package com.dbanalyzer.dbpkproject.database.cassandra.repository;

import com.dbanalyzer.dbpkproject.database.cassandra.entity.StartGeoPoint;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface StartGeoPointCassandraRepository extends CassandraRepository<StartGeoPoint, String> {
    StartGeoPoint findByAccidentId(String id);
}
