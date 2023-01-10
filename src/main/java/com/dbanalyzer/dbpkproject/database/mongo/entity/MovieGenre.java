package com.dbanalyzer.dbpkproject.database.mongo.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@Document("MovieGenre")
public class MovieGenre {

    @Id
    private Long id;

    private Long movieId;

    private String genre;

}