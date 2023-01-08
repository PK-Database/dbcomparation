package com.dbanalyzer.dbpkproject.csv.dto;

import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.*;

import java.util.Collection;
import java.util.List;

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
    private List<DirectorGenreDto> directorGenres;
    private Collection<MovieDto> movies;
}