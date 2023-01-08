package com.dbanalyzer.dbpkproject.csv.dto;

import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.Data;

import java.util.List;

@Data
@JGlobalMap
public class MovieDto {

    private Long id;
    private String name;
    private Integer year;
    private Float rank;

    private List<MovieGenreDto> movieGenres;

    private List<DirectorDto> directors;

    private List<RoleDto> roles;

}