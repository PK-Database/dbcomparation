package com.dbanalyzer.dbpkproject.csv.dto;

import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.*;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@JGlobalMap
public class MovieDto {

    private Long id;
    private String name;
    private Integer year;
    private Float rank;
    private List<MovieGenreDto> movieGenres;
    private List<DirectorDto> directors;
    private List<ActorDto> actors;
}