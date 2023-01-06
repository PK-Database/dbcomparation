package com.dbanalyzer.dbpkproject.database.cassandra.repository;

import com.dbanalyzer.dbpkproject.database.cassandra.entity.Weather;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface WeatherCassandraRepository extends CassandraRepository<Weather, String> {
    Weather findByAccidentId(String id);
}
