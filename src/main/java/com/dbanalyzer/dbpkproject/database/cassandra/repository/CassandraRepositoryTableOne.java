package com.dbanalyzer.dbpkproject.database.cassandra.repository;

import com.dbanalyzer.dbpkproject.database.cassandra.entity.TableOne;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface CassandraRepositoryTableOne extends CassandraRepository<TableOne, Long> {
}
