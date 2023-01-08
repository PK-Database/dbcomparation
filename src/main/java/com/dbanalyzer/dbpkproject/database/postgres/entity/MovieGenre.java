package com.dbanalyzer.dbpkproject.database.postgres.entity;

import com.googlecode.jmapper.annotations.JMap;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "movies_genres")
@IdClass(MovieGenre.class)
public class MovieGenre implements Serializable {

    @Id
    @Column(name = "movie_id")
    @JMap
    private Long movieId;

    @Id
    @JMap
    private String genre;

}