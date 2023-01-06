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
public class RoadDetails {

    @PrimaryKey
    private String accidentId;
    @JMap("side")
    private String side;
    @JMap("amenity")
    private Boolean amenity;
    @JMap("bump")
    private Boolean bump;
    @JMap("crossing")
    private Boolean crossing;
    @JMap("railway")
    private Boolean railway;
    @JMap("roundabout")
    private Boolean roundabout;
    @JMap("station")
    private Boolean station;
    @JMap("stop")
    private Boolean stop;
    @JMap("junction")
    private Boolean junction;
    @JMap("giveWay")
    private Boolean giveWay;
    @JMap("noExit")
    private Boolean noExit;
    @JMap("trafficCalming")
    private Boolean trafficCalming;
    @JMap("trafficSignal")
    private Boolean trafficSignal;
    @JMap("turningLoop")
    private Boolean turningLoop;

}