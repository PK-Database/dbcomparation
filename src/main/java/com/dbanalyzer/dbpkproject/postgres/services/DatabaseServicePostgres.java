package com.dbanalyzer.dbpkproject.postgres.services;

import com.dbanalyzer.dbpkproject.controllers.dto.UserDto;
import com.dbanalyzer.dbpkproject.manager.DataBaseService;
import com.dbanalyzer.dbpkproject.postgres.entity.TableOne;
import com.dbanalyzer.dbpkproject.postgres.repository.PostgresRepositoryTableOne;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
@Slf4j
public class DatabaseServicePostgres implements DataBaseService {

    private final PostgresRepositoryTableOne exampleRepository;

    @Override
    public Collection<UserDto> getUsers() {
//        exampleRepository.save(TableOne.builder().name("dom").surname("iry").build());
        return convert(exampleRepository.findAll());
    }

    private Collection<UserDto> convert(Collection<TableOne> all) {
//        return all.stream().map(el -> UserDto.builder().name(el.getName()).surname(el.getSurname()).build()).collect(Collectors.toList());
        return null;
    }
}
