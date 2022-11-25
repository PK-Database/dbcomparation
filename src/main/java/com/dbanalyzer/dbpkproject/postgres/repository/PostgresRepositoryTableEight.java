package com.dbanalyzer.dbpkproject.postgres.repository;

import com.dbanalyzer.dbpkproject.postgres.entity.TableEight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostgresRepositoryTableEight extends JpaRepository<TableEight, Long> {
}
