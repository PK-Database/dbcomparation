package com.dbanalyzer.dbpkproject.database.cassandra.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.cassandra.core.mapping.Frozen;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@UserDefinedType
public class Location {
    @Frozen
    private StartGeoPoint startGeoPoint;
    @Frozen
    private EndGeoPoint endGeoPoint;
    private String street;
    private String number;
    private String city;
    private String county;
    private String zipCode;
    private String state;
    private String country;
    private String timeZone;
    private String airportCode;

}