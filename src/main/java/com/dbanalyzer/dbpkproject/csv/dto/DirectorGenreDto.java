package com.dbanalyzer.dbpkproject.csv.dto;

import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.Data;

@Data
@JGlobalMap
public class DirectorGenreDto {

    private String id;
    private Long directorId;
    private String genre;
    private Float prob;

}