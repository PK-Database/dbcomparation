package com.dbanalyzer.dbpkproject.database.cassandra.entity;

import com.dbanalyzer.dbpkproject.database.cassandra.usertypes.Director;
import com.dbanalyzer.dbpkproject.database.cassandra.usertypes.Actor;
import com.dbanalyzer.dbpkproject.database.cassandra.usertypes.MovieGenre;
import com.googlecode.jmapper.annotations.JMap;
import lombok.*;
import org.springframework.data.cassandra.core.mapping.Frozen;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table("movies")
public class Movie {

    @PrimaryKey
    @JMap
    private Long id;
    @JMap
    private String name;
    @JMap
    private Integer year;
    @JMap
    private Float rank;

    @JMap
    @Frozen
    private MovieGenre movieGenres;

    @JMap
    @Frozen
    private Set<Actor> actors;

    @JMap
    @Frozen
    private Set<Director> directors;
}
