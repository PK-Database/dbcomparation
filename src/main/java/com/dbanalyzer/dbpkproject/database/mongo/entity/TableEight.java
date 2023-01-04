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
@Document("TABLE_EIGHT")
public class TableEight {

    @Id
    private String id;

    private String sunriseSunset;

    private String civilTwilight;

    private String nauticalTwilight;

    private String astronomicalTwilight;
}
