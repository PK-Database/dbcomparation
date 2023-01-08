package com.dbanalyzer.dbpkproject.database.postgres.entity;

import com.googlecode.jmapper.annotations.JMap;
import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "directors")
public class Director {

    @Id
    @JMap
    private Long id;

    @Column(name = "first_name")
    @JMap
    private String firstName;

    @Column(name = "last_name")
    @JMap
    private String lastName;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "director_id")
    @JMap
    private Set<DirectorGenre> directorGenres;

    @OneToMany
    @JoinTable(
            name = "movies_directors",
            joinColumns = @JoinColumn(name = "director_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id"))
    private Collection<Movie> movies;

}