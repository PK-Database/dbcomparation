package com.dbanalyzer.dbpkproject.csv.mapper;

import com.dbanalyzer.dbpkproject.csv.dto.*;
import com.dbanalyzer.dbpkproject.database.cassandra.entity.*;
import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.enums.ChooseConfig;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import static java.util.stream.Collectors.toList;

@Component
public class CassandraMapper {

    public List<Accident> mapToEntitiesList(List<AccidentDto> dtos) {
        JMapper<Accident, AccidentDto> accidentMapper = new JMapper<>
                (Accident.class, AccidentDto.class);

        return dtos.stream()
                .map(accidentMapper::getDestination)
                .peek(accident -> accident.setId(LocalDateTime.now() + "_" + UUID.randomUUID()))
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
