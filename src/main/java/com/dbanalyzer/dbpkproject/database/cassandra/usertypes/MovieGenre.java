package com.dbanalyzer.dbpkproject.database.cassandra.usertypes;

import com.googlecode.jmapper.annotations.JMap;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@UserDefinedType
public class MovieGenre {

    @JMap
    private Long movieId;
    @JMap
    private String genre;
}