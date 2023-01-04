package com.dbanalyzer.dbpkproject.database.postgres.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "start_geo_point_id")
    private StartGeoPoint startGeoPoint;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "end_geo_point_id")
    private EndGeoPoint endGeoPoint;

    private String street;
    private String number;
    private String city;
    private String county;

    @Column(name = "zip_code")
    private String zipCode;

    private String state;
    private String country;

    @Column(name = "time_zone")
    private String timeZone;

    @JsonProperty("Airport_Code")
    private String airportCode;

}