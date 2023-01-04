package com.dbanalyzer.dbpkproject.csv.mapper;

import com.dbanalyzer.dbpkproject.csv.dto.AccidentDto;
import com.dbanalyzer.dbpkproject.database.postgres.entity.Accident;
import com.googlecode.jmapper.JMapper;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class PostgresMapper {

    public List<Accident> mapToEntitiesList(List<AccidentDto> dtos) {
        JMapper<Accident, AccidentDto> accidentMapper = new JMapper<>
                (Accident.class, AccidentDto.class);

        return dtos.stream()
                .map(accidentMapper::getDestination)
                .collect(toList());
    }

    public List<AccidentDto> mapToDtoList(List<Accident> dtos) {
        JMapper<AccidentDto, Accident> accidentMapper = new JMapper<>
                (AccidentDto.class, Accident.class);

        return dtos.stream()
                .map(accidentMapper::getDestination)
                .collect(toList());
    }

}