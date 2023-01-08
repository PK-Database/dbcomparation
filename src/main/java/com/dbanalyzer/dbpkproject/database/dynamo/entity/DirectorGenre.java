package com.dbanalyzer.dbpkproject.database.dynamo.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.*;

@Data
@DynamoDBDocument
public class DirectorGenre {

    private Long directorId;
    private String genre;
    private Float prob;

}