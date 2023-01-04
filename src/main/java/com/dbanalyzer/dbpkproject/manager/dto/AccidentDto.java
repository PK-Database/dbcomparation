package com.dbanalyzer.dbpkproject.manager.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.Data;

@Data
@JGlobalMap(excluded = "id")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccidentDto {

    private String id;

    @JsonProperty("Severity")
    private Integer severity;

    @JsonProperty("Start_Time")
    @JsonPropertyDescription("Shows end time of the accident in local time zone. End time here refers to when the impact of accident on traffic flow was dismissed.")
    private String startTime;

    @JsonProperty("End_Time")
    private String endTime;

    @JsonProperty("Distance(mi)")
    private String distance;

    @JsonProperty("Description")
    private String description;

    @JsonUnwrapped
    private LocationDto location;

    @JsonUnwrapped
    private WeatherDto weather;

    @JsonUnwrapped
    private RoadDetailsDto roadDetails;

}