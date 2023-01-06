package com.dbanalyzer.dbpkproject.database.cassandra.entity;

import com.googlecode.jmapper.annotations.JMap;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import org.springframework.data.cassandra.core.mapping.Table;
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    @PrimaryKey
    private String accidentId;
    @JMap("street")
    private String street;
    @JMap("number")
    private String number;
    @JMap("city")
    private String city;
    @JMap("county")
    private String county;
    @JMap("zipCode")
    private String zipCode;
    @JMap("state")
    private String state;
    @JMap("country")
    private String country;
    @JMap("timeZone")
    private String timeZone;
    @JMap("airportCode")
    private String airportCode;

}