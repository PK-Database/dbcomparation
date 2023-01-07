package com.dbanalyzer.dbpkproject.csv.dto;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Builder(toBuilder = true)
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DirectorDto {

    private Long id;
    private String firstName;
    private String lastName;
    private DirectorGenreDto directorGenreDto;
    private Collection<MovieDto> movies;
}
