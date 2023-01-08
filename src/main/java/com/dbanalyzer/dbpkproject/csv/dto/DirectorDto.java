package com.dbanalyzer.dbpkproject.csv.dto;

import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.*;

import java.util.Collection;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@JGlobalMap
public class DirectorDto {

    private Long id;
    private String firstName;
    private String lastName;
    private DirectorGenreDto directorGenre;
    private Collection<MovieDto> movies;
}