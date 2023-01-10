package com.dbanalyzer.dbpkproject.database.mongo.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@Document("DirectorGenre")
public class DirectorGenre {

    @Id
    private Long id;

    private Long directorId;

    private String genre;

    private Float prob;

}