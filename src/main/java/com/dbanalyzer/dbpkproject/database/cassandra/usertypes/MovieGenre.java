package com.dbanalyzer.dbpkproject.database.cassandra.usertypes;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@UserDefinedType
public class MovieGenre {

    @Column("movie_id")
    private Long movieId;
    private String genre;
}
