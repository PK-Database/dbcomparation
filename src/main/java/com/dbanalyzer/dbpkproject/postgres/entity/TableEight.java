package com.dbanalyzer.dbpkproject.postgres.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TABLE_EIGHT", schema = "public")
@AllArgsConstructor
@Getter
@Builder
@NoArgsConstructor
public class TableEight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sunriseSunset;

    private String civilTwilight;

    private String nauticalTwilight;

    private String astronomicalTwilight;
}
