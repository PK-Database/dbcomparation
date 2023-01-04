package com.dbanalyzer.dbpkproject.database.cassandra.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Builder
@NoArgsConstructor
@Table
public class TableOne {

    @PrimaryKeyColumn
    @Builder.Default
    private UUID id = UUID.randomUUID();
    @Column
    private Integer severity;
    @Column
    private String startTime;
    @Column
    private String endTime;
    @Column
    private String startLatitude;
    @Column
    private String startLongitude;
}
