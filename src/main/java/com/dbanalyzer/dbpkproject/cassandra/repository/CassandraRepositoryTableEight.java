package com.dbanalyzer.dbpkproject.cassandra.repository;

import com.dbanalyzer.dbpkproject.cassandra.entity.TableEight;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CassandraRepositoryTableEight extends CassandraRepository<TableEight, Long> {
}
