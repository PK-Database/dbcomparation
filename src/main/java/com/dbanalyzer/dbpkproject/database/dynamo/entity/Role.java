package com.dbanalyzer.dbpkproject.database.dynamo.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Data;

@Data
@DynamoDBDocument
public class Role {

    private String id;
    private Actor actor;
    private Movie movie;
    private String role;

}