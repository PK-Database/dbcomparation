package com.dbanalyzer.dbpkproject.database.cassandra.repository;

import com.dbanalyzer.dbpkproject.database.cassandra.entity.EndGeoPoint;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface EndGeoPointCassandraRepository extends CassandraRepository<EndGeoPoint, String> {
    EndGeoPoint findByAccidentId(String id);
}
