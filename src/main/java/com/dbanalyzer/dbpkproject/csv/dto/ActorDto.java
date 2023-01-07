package com.dbanalyzer.dbpkproject.csv.dto;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Builder(toBuilder = true)
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ActorDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private Collection<RoleDto> roles;
}
