package com.dbanalyzer.dbpkproject.database.cassandra.usertypes;

import com.googlecode.jmapper.annotations.JMap;
import lombok.*;
import org.springframework.data.cassandra.core.mapping.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@UserDefinedType
public class Director {

    @JMap
    private Long id;

    @JMap
    @Column("first_name")
    private String firstName;

    @JMap
    @Column("last_name")
    private String lastName;

    @JMap
    @Frozen
    private Set<DirectorGenre> directorGenres;
}
