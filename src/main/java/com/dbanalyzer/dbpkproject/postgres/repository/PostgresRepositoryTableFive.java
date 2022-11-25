package com.dbanalyzer.dbpkproject.postgres.repository;

import com.dbanalyzer.dbpkproject.postgres.entity.TableFive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostgresRepositoryTableFive extends JpaRepository<TableFive, Long> {
}
