package com.dbanalyzer.dbpkproject.database.cassandra.entity;

import com.googlecode.jmapper.annotations.JMap;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;

@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Accident {

    @JMap("id")
    @PrimaryKey
    private String id;
    @JMap("severity")
    private Integer severity;
    @JMap("distance")
    private String distance;
    @JMap("description")
    private String description;
    @JMap("startTime")
    private LocalDateTime startTime;
    @JMap("endTime")
    private LocalDateTime endTime;
}