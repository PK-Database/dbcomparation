package com.dbanalyzer.dbpkproject.database.cassandra.usertypes;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@UserDefinedType
public class DirectorGenre {

    private String genre;
    private Float prob;
}
