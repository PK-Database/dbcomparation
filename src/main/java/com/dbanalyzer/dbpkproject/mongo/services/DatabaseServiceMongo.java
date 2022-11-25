package com.dbanalyzer.dbpkproject.mongo.services;

import com.dbanalyzer.dbpkproject.controllers.dto.UserDto;
import com.dbanalyzer.dbpkproject.manager.DataBaseService;
import com.dbanalyzer.dbpkproject.mongo.repository.MongoRepositoryTableOne;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class DatabaseServiceMongo implements DataBaseService {

    private final MongoRepositoryTableOne mongoExampleRepo;


    @Override
    public Collection<UserDto> getUsers() {
        return Collections.emptyList();
    }


//    private Collection<UserDto> convert(Collection<User> users){
//        return users.stream().map(el -> UserDto.builder().name(el.getName()).surname(el.getSurname()).build()).collect(Collectors.toList());
//    }
}
