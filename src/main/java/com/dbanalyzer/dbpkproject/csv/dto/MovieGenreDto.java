package com.dbanalyzer.dbpkproject.csv.dto;

import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.Data;

@Data
@JGlobalMap
public class MovieGenreDto {

    private String id;
    private Long movieId;
    private String genre;

}