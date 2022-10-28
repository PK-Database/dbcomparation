package com.dbanalyzer.dbpkproject.controllers.dto;

import lombok.*;

@RequiredArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
public class UserDto {

    private final String name;
    private final String surname;
}
