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
@Document("TABLE_FIVE")
public class TableFive {

    @Id
    private String id;

    private String windDirection;

    private String weatherCondition;

    private Boolean amenity;

    private Boolean bump;

    private Boolean crossing;
}
