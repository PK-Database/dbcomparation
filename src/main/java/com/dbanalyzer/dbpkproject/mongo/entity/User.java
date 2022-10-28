package com.dbanalyzer.dbpkproject.mongo.entity;

import lombok.*;

import javax.persistence.Id;

@AllArgsConstructor
@Getter
@Builder
@NoArgsConstructor
public class User {

    @Id
    private String id;
    private String name;
    private String surname;
}
