package com.dbanalyzer.dbpkproject.database.cassandra.repository;

import com.dbanalyzer.dbpkproject.database.cassandra.entity.RoadDetails;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface RoadDetailsCassandraRepository extends CassandraRepository<RoadDetails, String> {
    RoadDetails findByAccidentId(String id);
}
