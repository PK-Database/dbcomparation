package com.dbanalyzer.dbpkproject.database.cassandra.usertypes;

import com.googlecode.jmapper.annotations.JMap;
import lombok.*;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@UserDefinedType
public class DirectorGenre {

    @JMap
    private Long directorId;
    @JMap
    private String genre;
    @JMap
    private Float prob;
}
