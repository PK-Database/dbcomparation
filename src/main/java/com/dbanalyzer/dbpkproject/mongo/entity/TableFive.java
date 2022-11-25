package com.dbanalyzer.dbpkproject.postgres.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TABLE_FIVE", schema = "public")
@AllArgsConstructor
@Getter
@Builder
@NoArgsConstructor
public class TableFive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String windDirection;

    private String weatherCondition;

    private Boolean amenity;

    private Boolean bump;

    private Boolean crossing;
}
