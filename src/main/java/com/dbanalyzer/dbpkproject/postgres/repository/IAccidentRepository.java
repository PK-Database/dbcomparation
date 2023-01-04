package com.dbanalyzer.dbpkproject.postgres.repository;

import com.dbanalyzer.dbpkproject.postgres.entity.Accident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAccidentRepository extends JpaRepository<Accident, Long> {

    List<Accident> findAll();

}