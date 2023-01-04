package com.dbanalyzer.dbpkproject.database.postgres.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "weather_timestamp")
    private String weatherTimestamp;

    @Column(name = "wind_direction")
    private String windDirection;

    @Column(name = "weather_condition")
    private String weatherCondition;

}