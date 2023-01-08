package com.dbanalyzer.dbpkproject.database.postgres.entity;

import com.googlecode.jmapper.annotations.JMap;
import lombok.*;

import javax.persistence.*;
import java.util.Set;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @JMap
    private Long id;

    @JMap
    private String name;
    @JMap
    private Integer year;
    @JMap
    private Float rank;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id")
    @JMap
    private MovieGenre movieGenres;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "roles",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id")
    )
    @JMap
    private Set<Actor> actors;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "movies_directors",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "director_id")
    )
    @JMap
    private Set<Director> directors;

}