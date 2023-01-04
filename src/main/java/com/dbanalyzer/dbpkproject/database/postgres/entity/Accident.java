package com.dbanalyzer.dbpkproject.database.postgres.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Accident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer severity;
    private String distance;

    @Lob
    private String description;

    @Column(name = "start_time", columnDefinition = "TIMESTAMP")
    private LocalDateTime startTime;

    @Column(name = "end_time", columnDefinition = "TIMESTAMP")
    private LocalDateTime endTime;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "weather_id")
    private Weather weather;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "road_details_id")
    private RoadDetails roadDetails;

}