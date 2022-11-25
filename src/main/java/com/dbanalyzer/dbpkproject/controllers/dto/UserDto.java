package com.dbanalyzer.dbpkproject.controllers.dto;

import lombok.EqualsAndHashCode;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class UserDto {

    private final String name;
    private final String surname;
}
