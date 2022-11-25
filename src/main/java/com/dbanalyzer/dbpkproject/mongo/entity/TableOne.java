package com.dbanalyzer.dbpkproject.mongo.entity;

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
@Document("TABLE_ONE")
public class TableOne {

    @Id
    private String id;

    private Integer severity;

    private String startTime;

    private String endTime;

    private String startLatitude;

    private String startLongitude;
}
