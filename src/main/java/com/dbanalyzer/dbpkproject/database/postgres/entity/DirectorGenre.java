package com.dbanalyzer.dbpkproject.database.postgres.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "directors_genres")
public class DirectorGenre {

    @Id
    @Column(name = "director_id")
    private Long directorId;

    @Column
    private String genre;

    @Column
    private Float prob;
}
