package com.dbanalyzer.dbpkproject.database.postgres.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "directors_genres")
public class DirectorGenre {

    @Id
    private Long id;

    @Column(name = "director_id")
    private Long directorId;

    @Column
    private String genre;

    @Column
    private Float prob;

}