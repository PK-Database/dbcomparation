package com.dbanalyzer.dbpkproject.database.cassandra.services;

import com.dbanalyzer.dbpkproject.csv.dto.AccidentDto;
import com.dbanalyzer.dbpkproject.csv.mapper.CassandraMapper;
import com.dbanalyzer.dbpkproject.database.cassandra.entity.*;
import com.dbanalyzer.dbpkproject.database.cassandra.repository.*;
import com.dbanalyzer.dbpkproject.manager.DataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class CassandraService implements DataBaseService {
    private final ICassandraAccidentRepository accidentRepository;
    private final CassandraMapper cassandraMapper;

    @Autowired
    public CassandraService(ICassandraAccidentRepository accidentRepository,
                            CassandraMapper cassandraMapper) {
        this.accidentRepository = accidentRepository;
        this.cassandraMapper = cassandraMapper;
    }
    public void save(List<Accident> accidents) {
        accidentRepository.saveAll(accidents);
    }

    @Override
    public Collection<AccidentDto> getAccidents() {
        return cassandraMapper.mapToDtoList(accidentRepository.findAll());
    }
}
