package com.dbanalyzer.dbpkproject.database.postgres.repository;

import com.dbanalyzer.dbpkproject.database.postgres.entity.Accident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAccidentRepository extends JpaRepository<Accident, Long> {

    List<Accident> findAll();

}