package com.dbanalyzer.dbpkproject.database.postgres.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    private Long id;

    private String name;
    private Integer year;
    private Float rank;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "movie_id")
    private Set<MovieGenre> movieGenres;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "movie_id")
    private Set<Role> roles;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "movies_directors",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "director_id")
    )
    private Set<Director> directors;

}