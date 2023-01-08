package com.dbanalyzer.dbpkproject.database.dynamo.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.dbanalyzer.dbpkproject.csv.dto.DirectorGenreDto;
import com.dbanalyzer.dbpkproject.csv.dto.MovieDto;
import lombok.Data;

import java.util.Collection;

@Data
@DynamoDBDocument
public class Director {

    private Long id;
    private String firstName;
    private String lastName;
    private DirectorGenreDto directorGenreDto;
    private Collection<MovieDto> movies;

}