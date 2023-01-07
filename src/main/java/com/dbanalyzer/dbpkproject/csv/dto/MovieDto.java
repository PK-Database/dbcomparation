package com.dbanalyzer.dbpkproject.csv.dto;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Builder(toBuilder = true)
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {

    private Long id;
    private String name;
    private Integer year;
    private Float rank;
    private MovieGenreDto movieGenre;
    private Collection<RoleDto> roles;
    private Collection<DirectorDto> directors;
}
