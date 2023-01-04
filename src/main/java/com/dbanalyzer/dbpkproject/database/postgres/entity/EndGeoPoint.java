package com.dbanalyzer.dbpkproject.database.postgres.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "end_geo_point")
public class EndGeoPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Decimal(10,5)")
    private Float latitude;

    @Column(columnDefinition = "Decimal(10,5)")
    private Float longitude;

}