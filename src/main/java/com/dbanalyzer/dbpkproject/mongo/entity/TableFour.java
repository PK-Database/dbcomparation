package com.dbanalyzer.dbpkproject.postgres.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TABLE_FOUR", schema = "public")
@AllArgsConstructor
@Getter
@Builder
@NoArgsConstructor
public class TableFour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String country;

    private String state;

    private String timeZone;

    private String airportCode;

    private String weatherTimestamp;
}
