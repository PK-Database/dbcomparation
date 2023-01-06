package com.dbanalyzer.dbpkproject.database.cassandra.entity;

import com.googlecode.jmapper.annotations.JMap;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@UserDefinedType
public class RoadDetails {
    private String side;
    private Boolean amenity;
    private Boolean bump;
    private Boolean crossing;
    private Boolean railway;
    private Boolean roundabout;
    private Boolean station;
    private Boolean stop;
    private Boolean junction;
    private Boolean giveWay;
    private Boolean noExit;
    private Boolean trafficCalming;
    private Boolean trafficSignal;
    private Boolean turningLoop;

}