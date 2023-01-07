package com.dbanalyzer.dbpkproject.database.cassandra.entity;

import com.dbanalyzer.dbpkproject.database.cassandra.usertypes.DirectorGenre;
import com.dbanalyzer.dbpkproject.database.cassandra.usertypes.Movie;
import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.Frozen;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Collection;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table("directors")
public class Director {

    @PrimaryKey
    private Long id;

    @Column("first_name")
    private String firstName;

    @Column("last_name")
    private String lastName;

    @Frozen
    private DirectorGenre directorGenre;

    @Frozen
    private Set<Movie> movies;
}
