package com.dbanalyzer.dbpkproject.database.dynamo.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Data;

@Data
@DynamoDBDocument
public class RoadDetails {

    private String side;
    private Boolean amenity;
    private Boolean bump;
    private Boolean crossing;
    private Boolean railway;
    private Boolean roundabout;
    private Boolean station;
    private Boolean stop;
    private Boolean junction;
    private Boolean giveWay;
    private Boolean noExit;
    private Boolean trafficCalming;
    private Boolean trafficSignal;
    private Boolean turningLoop;

}