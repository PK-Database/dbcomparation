package com.dbanalyzer.dbpkproject.database.cassandra.usertypes;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.Frozen;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.util.Collection;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@UserDefinedType("movies")
public class Movie {

    @PrimaryKey
    private Long id;
    private String name;
    private Integer year;
    private Float rank;

    @Frozen
    private MovieGenre movieGenre;

    @Frozen
    private Set<RoleActor> roles;
}
