package com.dbanalyzer.dbpkproject.database.mongo.services;

import com.dbanalyzer.dbpkproject.manager.DataBaseService;
import com.dbanalyzer.dbpkproject.csv.dto.AccidentDto;
import com.dbanalyzer.dbpkproject.database.mongo.repository.MongoRepositoryTableOne;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;

@Service
@RequiredArgsConstructor
@Slf4j
public class DatabaseServiceMongo implements DataBaseService {

    private final MongoRepositoryTableOne mongoExampleRepo;



    public Collection<AccidentDto> getAccidents() {
        return Collections.emptyList();
    }


//    private Collection<UserDto> convert(Collection<User> users){
//        return users.stream().map(el -> UserDto.builder().name(el.getName()).surname(el.getSurname()).build()).collect(Collectors.toList());
//    }
}
