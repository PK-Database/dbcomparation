package com.dbanalyzer.dbpkproject.csv.dto;

import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.Data;

@Data
@JGlobalMap
public class RoleDto {

    private Long id;
    private ActorDto actor;
    //    private MovieDto movie;
    private String role;

}