package com.dbanalyzer.dbpkproject.database.mongo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;


@AllArgsConstructor
@Getter
@Builder
@NoArgsConstructor
@Document("TABLE_SEVEN")
public class TableSeven {

    @Id
    private String id;

    private Boolean station;

    private Boolean stop;

    private Boolean trafficCalming;

    private Boolean trafficSignal;

    private Boolean turningLoop;
}
