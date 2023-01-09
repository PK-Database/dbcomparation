package com.dbanalyzer.dbpkproject.csv.dto;

import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
@JGlobalMap
public class MovieDto {

    private Long id;
    private String name;
    private Integer year;
    private Float rank;

    private Set<MovieGenreDto> movieGenres;

    private List<DirectorDto> directors;

    private List<RoleDto> roles;

}