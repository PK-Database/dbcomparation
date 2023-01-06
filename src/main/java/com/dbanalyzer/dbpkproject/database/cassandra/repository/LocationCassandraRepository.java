package com.dbanalyzer.dbpkproject.database.cassandra.repository;

import com.dbanalyzer.dbpkproject.database.cassandra.entity.Location;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface LocationCassandraRepository extends CassandraRepository<Location, String> {
    Location findByAccidentId(String id);
}
