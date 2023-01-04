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
public class TableSix {

    @PrimaryKeyColumn
    @Builder.Default
    private UUID id = UUID.randomUUID();
    @Column
    private Boolean giveWay;
    @Column
    private Boolean junction;
    @Column
    private Boolean noExit;
    @Column
    private Boolean railway;
    @Column
    private Boolean roundabout;
}
