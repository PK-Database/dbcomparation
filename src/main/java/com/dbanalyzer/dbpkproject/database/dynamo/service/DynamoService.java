package com.dbanalyzer.dbpkproject.database.dynamo.service;

import com.dbanalyzer.dbpkproject.csv.dto.AccidentDto;
import com.dbanalyzer.dbpkproject.csv.mapper.DynamoMapper;
import com.dbanalyzer.dbpkproject.database.dynamo.entity.Accident;
import com.dbanalyzer.dbpkproject.database.dynamo.repository.IDynamoAccidentRepository;
import com.dbanalyzer.dbpkproject.manager.DataBaseService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class DynamoService implements DataBaseService {

    private final IDynamoAccidentRepository accidentRepository;
    private final DynamoMapper dynamoMapper;
    public DynamoService(IDynamoAccidentRepository accidentRepository, DynamoMapper dynamoMapper) {
        this.accidentRepository = accidentRepository;
        this.dynamoMapper = dynamoMapper;
    }

    public List<Accident> getAll() {
        return accidentRepository.findAll();
    }

    public void save(List<Accident> accidents) {
        accidentRepository.saveAll(accidents);
    }

    @Override
    public Collection<AccidentDto> getAccidents() {
        return dynamoMapper.mapToDtoList(accidentRepository.findAll());
    }
}