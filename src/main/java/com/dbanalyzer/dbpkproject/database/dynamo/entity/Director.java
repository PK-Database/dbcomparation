package com.dbanalyzer.dbpkproject.database.dynamo.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Data;

@Data
@DynamoDBDocument
public class Director {

    private String id;
    private String firstName;
    private String lastName;
    private DirectorGenre directorGenre;

//    private Collection<MovieDto> movies;

}