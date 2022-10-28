package com.dbanalyzer.dbpkproject.postgres.repository;

import com.dbanalyzer.dbpkproject.postgres.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleRepository extends JpaRepository<User, Long> {
}
