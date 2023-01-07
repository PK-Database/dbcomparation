package com.dbanalyzer.dbpkproject.database.cassandra.usertypes;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@UserDefinedType("movie_roles")
public class RoleActor {

    private Actor actor;
    private String role;
}
