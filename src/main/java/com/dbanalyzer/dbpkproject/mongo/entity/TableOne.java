package com.dbanalyzer.dbpkproject.postgres.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TABLE_ONE", schema = "public")
@AllArgsConstructor
@Getter
@Builder
@NoArgsConstructor
public class TableOne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer severity;

    private String startTime;

    private String endTime;

    private String startLatitude;

    private String startLongitude;
}
