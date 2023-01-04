package com.dbanalyzer.dbpkproject.database.dynamo.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Data;

@Data
@DynamoDBDocument
public class Location {

    private StartGeoPoint startGeoPoint;
    private EndGeoPoint endGeoPoint;
    private String street;
    private String number;
    private String city;
    private String county;
    private String zipCode;
    private String state;
    private String country;
    private String timeZone;
    private String airportCode;

}