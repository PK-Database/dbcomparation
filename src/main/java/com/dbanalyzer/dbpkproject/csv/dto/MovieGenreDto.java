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
public class MovieGenreDto {
    private Long movieId;
    private String genre;
}
