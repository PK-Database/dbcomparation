package com.dbanalyzer.dbpkproject.database.dynamo.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@DynamoDBTable(tableName = "Accident")
@DynamoDBDocument
public class Accident {

    private String id;
    private Integer severity;
    private String distance;
    private String description;

    @DynamoDBTypeConverted(converter = LocalDateTimeConverter.class)
    private LocalDateTime startTime;

    @DynamoDBTypeConverted(converter = LocalDateTimeConverter.class)
    private LocalDateTime endTime;
    private Location location;
    private Weather weather;
    private RoadDetails roadDetails;

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    public String getId() {
        return id;
    }

    static public class LocalDateTimeConverter implements DynamoDBTypeConverter<String, LocalDateTime> {

        @Override
        public String convert(final LocalDateTime time) {

            return time.toString();
        }

        @Override
        public LocalDateTime unconvert(final String stringValue) {

            return LocalDateTime.parse(stringValue);
        }
    }

}