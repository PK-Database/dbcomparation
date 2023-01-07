package com.dbanalyzer.dbpkproject.csv.dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder(toBuilder = true)
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DirectorGenreDto {

    private Long directorId;
    private String genre;
    private Float prob;
}
