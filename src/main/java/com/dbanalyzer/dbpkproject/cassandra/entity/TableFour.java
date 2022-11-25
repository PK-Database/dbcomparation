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
@Document("TABLE_FOUR")
public class TableFour {

    @Id
    private String id;

    private String country;

    private String state;

    private String timeZone;

    private String airportCode;

    private String weatherTimestamp;
}
