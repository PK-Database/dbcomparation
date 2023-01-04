package com.dbanalyzer.dbpkproject.postgres.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "end_geo_point")
public class EndGeoPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("End_Lat")
    private String latitude;

    @JsonProperty("End_Long")
    private String longitude;

}