package com.dbanalyzer.dbpkproject.database.mongo.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@Document("Role")
public class Role {

    @Id
    private Long id;

    private Actor actor;

    private String role;

}