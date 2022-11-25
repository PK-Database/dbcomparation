package com.dbanalyzer.dbpkproject.postgres.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "USER", schema = "public")
@AllArgsConstructor
@Getter
@Builder
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
}
