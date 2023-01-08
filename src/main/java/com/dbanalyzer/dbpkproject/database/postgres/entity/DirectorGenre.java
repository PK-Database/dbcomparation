package com.dbanalyzer.dbpkproject.database.postgres.entity;

import com.googlecode.jmapper.annotations.JMap;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "directors_genres")
@IdClass(DirectorGenre.class)
public class DirectorGenre implements Serializable {

    @Id
    @Column(name = "director_id")
    @JMap
    private Long directorId;

    @Id
    @Column
    @JMap
    private String genre;

    @Column
    @JMap
    private Float prob;

}