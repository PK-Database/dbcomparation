package com.dbanalyzer.dbpkproject.manager;

import com.dbanalyzer.dbpkproject.controllers.dto.UserDto;

import java.util.Collection;

public interface DataBaseService {

    Collection<UserDto> getUsers();
}
