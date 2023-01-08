package com.dbanalyzer.dbpkproject.database.postgres.entity;

import com.googlecode.jmapper.annotations.JMap;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "movies_genres")
public class MovieGenre {

    @Id
    @Column(name = "movie_id")
    @JMap
    private Long movieId;

    @JMap
    private String genre;

}