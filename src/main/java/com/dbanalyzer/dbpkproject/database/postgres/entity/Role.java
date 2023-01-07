package com.dbanalyzer.dbpkproject.database.postgres.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "roles")
public class Role {

    @EmbeddedId
    private RoleKey id;

    @ManyToOne
    @MapsId("actor_id")
    @JoinColumn(name = "actor_id")
    private Actor actor;

    @ManyToOne
    @MapsId("movie_id")
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @Column
    private String role;
}
