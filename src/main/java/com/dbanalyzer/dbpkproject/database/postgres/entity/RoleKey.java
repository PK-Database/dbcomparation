package com.dbanalyzer.dbpkproject.database.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class RoleKey implements Serializable {
    @Column(name = "actor_id")
    private Long actorId;

    @Column(name = "movie_id")
    private Long movieId;
}
