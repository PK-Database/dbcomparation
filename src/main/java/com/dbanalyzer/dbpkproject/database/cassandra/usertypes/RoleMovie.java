package com.dbanalyzer.dbpkproject.database.cassandra.usertypes;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@UserDefinedType("actor_roles")
public class RoleMovie {

    private Movie movie;
    private String role;
}
