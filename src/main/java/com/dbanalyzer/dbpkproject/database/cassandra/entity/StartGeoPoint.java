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
public class StartGeoPoint {

    @PrimaryKey
    private String accidentId;
    @JMap("latitude")
    private Float latitude;
    @JMap("longitude")
    private Float longitude;

}