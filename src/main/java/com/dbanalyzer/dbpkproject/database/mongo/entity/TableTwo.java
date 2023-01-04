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
@Document("TABLE_TWO")
public class TableTwo {

    @Id
    private String id;

    private String endLatitude;

    private String endLongitude;

    private String distance;

    private String description;

    private String number;
}
