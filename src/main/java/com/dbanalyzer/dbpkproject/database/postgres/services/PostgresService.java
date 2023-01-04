package com.dbanalyzer.dbpkproject.database.postgres.services;

import com.dbanalyzer.dbpkproject.manager.DataBaseService;
import com.dbanalyzer.dbpkproject.csv.dto.AccidentDto;
import com.dbanalyzer.dbpkproject.csv.mapper.PostgresMapper;
import com.dbanalyzer.dbpkproject.database.postgres.entity.Accident;
import com.dbanalyzer.dbpkproject.database.postgres.repository.IAccidentRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class PostgresService implements DataBaseService {

    private final IAccidentRepository accidentRepository;
    private final PostgresMapper postgresMapper;

    public PostgresService(IAccidentRepository accidentRepository, PostgresMapper postgresMapper) {
        this.accidentRepository = accidentRepository;
        this.postgresMapper = postgresMapper;
    }

    public void save(List<Accident> accidents) {
        accidentRepository.saveAll(accidents);
    }

    @Override
    public Collection<AccidentDto> getAccidents() {
        return postgresMapper.mapToDtoList(accidentRepository.findAll());
    }

}