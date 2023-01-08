package com.dbanalyzer.dbpkproject.csv.dto;

import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.Data;

@Data
@JGlobalMap
public class ActorDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
//    private Collection<RoleDto> roles;

}