package com.dbanalyzer.dbpkproject.database.cassandra.usertypes;

import com.googlecode.jmapper.annotations.JMap;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@UserDefinedType
public class Actor {

    @JMap
    private Long id;

    @JMap
    @Column("first_name")
    private String firstName;

    @JMap
    @Column("last_name")
    private String lastName;

    @JMap
    @Column("gender")
    private String gender;
}
