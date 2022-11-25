package com.dbanalyzer.dbpkproject.cassandra.repository;

import com.dbanalyzer.dbpkproject.cassandra.entity.TableFive;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CassandraRepositoryTableFive extends CassandraRepository<TableFive, Long> {
}
