package com.dbanalyzer.dbpkproject.database.postgres.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "road_details")
public class RoadDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String side;
    private Boolean amenity;
    private Boolean bump;
    private Boolean crossing;
    private Boolean railway;
    private Boolean roundabout;
    private Boolean station;
    private Boolean stop;
    private Boolean junction;

    @Column(name = "give_way")
    private Boolean giveWay;

    @Column(name = "no_exit")
    private Boolean noExit;

    @Column(name = "traffic_calming")
    private Boolean trafficCalming;

    @Column(name = "traffic_signal")
    private Boolean trafficSignal;

    @Column(name = "turning_loop")
    private Boolean turningLoop;

}