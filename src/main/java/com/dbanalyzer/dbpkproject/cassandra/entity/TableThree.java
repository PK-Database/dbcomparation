package com.dbanalyzer.dbpkproject.cassandra.entity;

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
public class TableThree {

    @PrimaryKeyColumn
    @Builder.Default
    private UUID id = UUID.randomUUID();
    @Column
    private String street;
    @Column
    private String side;
    @Column
    private String city;
    @Column
    private String county;
    @Column
    private String zipCode;
}
