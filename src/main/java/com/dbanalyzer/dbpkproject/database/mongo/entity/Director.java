package com.dbanalyzer.dbpkproject.database.mongo.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@Document("Director")
public class Director {

    @Id
    private Long id;

    private String firstName;

    private String lastName;

    private DirectorGenre directorGenre;


}