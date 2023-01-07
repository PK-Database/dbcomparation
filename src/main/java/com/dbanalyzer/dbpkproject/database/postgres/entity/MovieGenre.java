package com.dbanalyzer.dbpkproject.database.postgres.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "movie_genres")
public class MovieGenre {

    @Id
    @Column(name = "movie_id")
    private Long movieId;

    @Column
    private String genre;
}
