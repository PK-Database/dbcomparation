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
@Document("TABLE_SIX")
public class TableSix {

    @Id
    private String id;

    private Boolean giveWay;

    private Boolean junction;

    private Boolean noExit;

    private Boolean railway;

    private Boolean roundabout;
}
