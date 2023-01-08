package com.dbanalyzer.dbpkproject.csv.dto;

import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.Data;

@Data
@JGlobalMap
public class DirectorDto {

    private Long id;
    private String firstName;
    private String lastName;

    private DirectorGenreDto directorGenre;

//    @JsonUnwrapped
//    @JsonBackReference
//    private Collection<MovieDto> movies;

}