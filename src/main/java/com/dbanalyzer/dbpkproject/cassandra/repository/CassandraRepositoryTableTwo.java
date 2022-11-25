package com.dbanalyzer.dbpkproject.cassandra.repository;

import com.dbanalyzer.dbpkproject.cassandra.entity.TableTwo;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CassandraRepositoryTableTwo extends CassandraRepository<TableTwo, Long> {
}
