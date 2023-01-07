package com.dbanalyzer.dbpkproject.database.cassandra.usertypes;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@UserDefinedType(value = "directors")
public class Director {

    private Long id;

    @Column("first_name")
    private String firstName;

    @Column("last_name")
    private String lastName;

    @Frozen
    private DirectorGenre directorGenre;
}
