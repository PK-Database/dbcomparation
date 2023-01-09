package com.dbanalyzer.dbpkproject.database.postgres.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "roles")
public class Role {

    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "actor_id")
    private Actor actor;

//    @ManyToOne
////    @MapsId("movie_id")
//    @JoinColumn(name = "movie_id")
//    private Movie movie;

    @Column
    private String role;

}