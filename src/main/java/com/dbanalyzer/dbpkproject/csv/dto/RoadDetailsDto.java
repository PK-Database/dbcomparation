package com.dbanalyzer.dbpkproject.csv.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.Data;

@Data
@JGlobalMap
@JsonIgnoreProperties(ignoreUnknown = true)
public class RoadDetailsDto {

    @JsonProperty("Side")
    @JsonPropertyDescription("Shows the relative side of the street (Right/Left)")
    private String side;

    @JsonProperty("Amenity")
    @JsonPropertyDescription("A POI annotation which indicates presence of amenity in a nearby location")
    private Boolean amenity;

    @JsonProperty("Bump")
    private Boolean bump;

    @JsonProperty("Crossing")
    private Boolean crossing;

    @JsonProperty("Give_Way")
    private Boolean giveWay;

    @JsonProperty("Junction")
    private Boolean junction;

    @JsonProperty("No_Exit")
    private Boolean noExit;

    @JsonProperty("Railway")
    private Boolean railway;

    @JsonProperty("Roundabout")
    private Boolean roundabout;

    @JsonProperty("Station")
    @JsonPropertyDescription("A POI annotation which indicates presence of station in a nearby location.")
    private Boolean station;

    @JsonProperty("Stop")
    private Boolean stop;

    @JsonProperty("Traffic_Calming")
    private Boolean trafficCalming;

    @JsonProperty("Traffic_Signal")
    private Boolean trafficSignal;

    @JsonProperty("Turning_Loop")
    private Boolean turningLoop;

}