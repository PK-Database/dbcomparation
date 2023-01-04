package com.dbanalyzer.dbpkproject.database.dynamo.service;

import com.dbanalyzer.dbpkproject.database.dynamo.entity.Accident;
import com.dbanalyzer.dbpkproject.database.dynamo.repository.IDynamoAccidentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DynamoService {

    private final IDynamoAccidentRepository accidentRepository;

    public DynamoService(IDynamoAccidentRepository accidentRepository) {
        this.accidentRepository = accidentRepository;
    }

    public List<Accident> getAll() {
        return accidentRepository.findAll();
    }

    public void save(List<Accident> accidents) {
        accidentRepository.saveAll(accidents);
    }

}