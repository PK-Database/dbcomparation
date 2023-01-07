package com.dbanalyzer.dbpkproject.database.postgres.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private Integer year;

    @Column
    private Float rank;

    @OneToOne
    @JoinColumn(name = "id")
    private MovieGenre movieGenre;

    @OneToMany(mappedBy = "movie")
    private Collection<Role> roles;

    @ManyToMany
    @JoinTable(
            name = "movies_directors",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "director_id"))
    private Collection<Director> directors;
}
