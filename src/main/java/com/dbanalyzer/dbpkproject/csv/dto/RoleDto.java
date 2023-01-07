package com.dbanalyzer.dbpkproject.csv.dto;

import com.dbanalyzer.dbpkproject.database.postgres.entity.RoleKey;
import lombok.*;

import javax.persistence.*;

@Builder(toBuilder = true)
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto {

    private RoleKey id;
    private ActorDto actor;
    private MovieDto movie;
    private String role;
}
