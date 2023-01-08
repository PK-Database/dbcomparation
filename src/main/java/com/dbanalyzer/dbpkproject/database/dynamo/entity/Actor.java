package com.dbanalyzer.dbpkproject.database.dynamo.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Data;

import java.util.Collection;

@Data
@DynamoDBDocument
public class Actor {

    private String firstName;
    private String lastName;
    private String gender;
    private Collection<Role> roles;

}