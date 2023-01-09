package com.dbanalyzer.dbpkproject.database.cassandra.entity;

import com.dbanalyzer.dbpkproject.database.cassandra.usertypes.MovieGenre;
import com.dbanalyzer.dbpkproject.database.cassandra.usertypes.Director;
import com.dbanalyzer.dbpkproject.database.cassandra.usertypes.Role;
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
    private Long id;
    private String name;
    private Integer year;
    private Float rank;

    @Frozen
    private Set<MovieGenre> movieGenres;

    @Frozen
    private Set<Role> roles;

    @Frozen
    private Set<Director> directors;
}
