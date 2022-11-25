package com.dbanalyzer.dbpkproject.cassandra.repository;

import com.dbanalyzer.dbpkproject.cassandra.entity.TableSeven;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CassandraRepositoryTableSeven extends CassandraRepository<TableSeven, Long> {
}
