package com.dbanalyzer.dbpkproject.database.mongo.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Set;

@Data
@Document("Movie")
public class Movie {

    @Id
    private Long id;
    private String name;
    private Integer year;
    private Float rank;
    private Set<MovieGenre> movieGenres;
    private Set<Role> roles;
    private Set<Director> directors;

}