package com.dbanalyzer.dbpkproject.csv.dto;

import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@JGlobalMap
public class DirectorGenreDto {

    private Long directorId;
    private String genre;
    private Float prob;
}