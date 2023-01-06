package com.dbanalyzer.dbpkproject.database.cassandra.entity;

import com.googlecode.jmapper.annotations.JMap;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.Frozen;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import org.springframework.data.cassandra.core.mapping.Table;
import java.time.LocalDateTime;

@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Accident {
    @PrimaryKey
    private String id;
    private Integer severity;
    private String distance;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @Frozen
    private Location location;
    @Frozen
    private Weather weather;
    @Frozen
    private RoadDetails roadDetails;
}