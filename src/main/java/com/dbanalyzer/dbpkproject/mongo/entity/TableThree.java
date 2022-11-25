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
@Document("TABLE_THREE")
public class TableThree {

    @Id
    private String id;

    private String street;

    private String side;

    private String city;

    private String county;

    private String zipCode;
}
