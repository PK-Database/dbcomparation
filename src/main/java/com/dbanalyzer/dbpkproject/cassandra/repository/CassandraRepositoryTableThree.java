package com.dbanalyzer.dbpkproject.cassandra.repository;

import com.dbanalyzer.dbpkproject.cassandra.entity.TableThree;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CassandraRepositoryTableThree extends CassandraRepository<TableThree, Long> {
}
