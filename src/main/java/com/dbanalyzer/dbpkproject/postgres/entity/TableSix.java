package com.dbanalyzer.dbpkproject.postgres.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TABLE_SIX", schema = "public")
@AllArgsConstructor
@Getter
@Builder
@NoArgsConstructor
public class TableSix {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean giveWay;

    private Boolean junction;

    private Boolean noExit;

    private Boolean railway;

    private Boolean roundabout;
}
