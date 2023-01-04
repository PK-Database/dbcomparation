package com.dbanalyzer.dbpkproject.postgres.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "start_geo_point")
public class StartGeoPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("Start_Lat")
    private String latitude;

    @JsonProperty("Start_Long")
    private String longitude;

}