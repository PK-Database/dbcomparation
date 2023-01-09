package com.dbanalyzer.dbpkproject.database.postgres.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "movies_genres")
public class MovieGenre {

    @Id
    private Long id;

    @Column(name = "movie_id")
    private Long movieId;

    private String genre;

}