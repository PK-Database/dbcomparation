package com.dbanalyzer.dbpkproject.database.cassandra.entity;

import com.dbanalyzer.dbpkproject.database.cassandra.usertypes.RoleMovie;
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
@Table("actors")
public class Actor {
    @PrimaryKey
    private Long id;

    @Column("first_name")
    private String firstName;

    @Column("last_name")
    private String lastName;

    @Column("gender")
    private String gender;

    @Frozen
    private Set<RoleMovie> roles;
}
