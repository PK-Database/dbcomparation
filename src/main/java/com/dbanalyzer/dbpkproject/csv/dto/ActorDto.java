package com.dbanalyzer.dbpkproject.csv.dto;

import com.googlecode.jmapper.annotations.JGlobalMap;
import com.googlecode.jmapper.annotations.JMap;
import lombok.*;

import java.util.Collection;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@JGlobalMap
public class ActorDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private Collection<MovieDto> movies;
}