package com.dbanalyzer.dbpkproject.database.postgres.entity;

import com.googlecode.jmapper.annotations.JMap;
import lombok.*;

import javax.persistence.*;
import java.util.Collection;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "actors")
public class Actor {

    @Id
    @JMap
    private Long id;

    @Column(name = "first_name")
    @JMap
    private String firstName;

    @Column(name = "last_name")
    @JMap
    private String lastName;

    @Column(name = "gender")
    @JMap
    private String gender;

    @OneToMany
    @JoinTable(
            name = "roles",
            joinColumns = @JoinColumn(name = "actor_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id"))
    private Collection<Movie> movies;

}