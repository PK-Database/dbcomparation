package com.dbanalyzer.dbpkproject.postgres.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TABLE_TWO", schema = "public")
@AllArgsConstructor
@Getter
@Builder
@NoArgsConstructor
public class TableTwo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String endLatitude;

    private String endLongitude;

    private String distance;

    private String description;

    private String number;
}
