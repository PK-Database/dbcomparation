package com.dbanalyzer.dbpkproject.postgres.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TABLE_SEVEN", schema = "public")
@AllArgsConstructor
@Getter
@Builder
@NoArgsConstructor
public class TableSeven {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean station;

    private Boolean stop;

    private Boolean trafficCalming;

    private Boolean trafficSignal;

    private Boolean turningLoop;
}
