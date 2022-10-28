package com.dbanalyzer.dbpkproject.postgres.services;

import com.dbanalyzer.dbpkproject.controllers.dto.UserDto;
import com.dbanalyzer.dbpkproject.manager.DataBaseService;
import com.dbanalyzer.dbpkproject.postgres.entity.User;
import com.dbanalyzer.dbpkproject.postgres.repository.ExampleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class DatabaseServicePostgres implements DataBaseService {

    private final ExampleRepository exampleRepository;

    @Override
    public Collection<UserDto> getUsers() {
        exampleRepository.save(User.builder().name("dom").surname("iry").build());
        return convert(exampleRepository.findAll());
    }

    private Collection<UserDto> convert(Collection<User> all) {
        return all.stream().map(el -> UserDto.builder().name(el.getName()).surname(el.getSurname()).build()).collect(Collectors.toList());
    }
}
