package com.dbanalyzer.dbpkproject.database.cassandra.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EndGeoPoint {
    @PrimaryKey
    private Float latitude;
    private Float longitude;
}