package com.dbanalyzer.dbpkproject.database.cassandra.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import javax.persistence.Table;
import java.util.UUID;


@AllArgsConstructor
@Getter
@Builder
@NoArgsConstructor
@Table
public class TableFour {

    @PrimaryKeyColumn
    @Builder.Default
    private UUID id = UUID.randomUUID();
    @Column
    private String country;
    @Column
    private String state;
    @Column
    private String timeZone;
    @Column
    private String airportCode;
    @Column
    private String weatherTimestamp;
}
