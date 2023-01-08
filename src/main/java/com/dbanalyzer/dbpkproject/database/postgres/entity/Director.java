package com.dbanalyzer.dbpkproject.database.postgres.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "directors")
public class Director {

    @Id
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToOne
    @JoinColumn(name = "id")
    private DirectorGenre directorGenre;

//    @ManyToMany
//    @JoinTable(
//            name = "movies_directors",
//            joinColumns = @JoinColumn(name = "director_id"),
//            inverseJoinColumns = @JoinColumn(name = "movie_id"))
//    private Collection<Movie> movies;

}