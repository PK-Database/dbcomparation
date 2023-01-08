package com.dbanalyzer.dbpkproject.database.postgres.entity;

import com.googlecode.jmapper.annotations.JMap;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "directors_genres")
public class DirectorGenre {

    @Id
    @Column(name = "director_id")
    @JMap
    private Long directorId;

    @Column
    @JMap
    private String genre;

    @Column
    @JMap
    private Float prob;

}