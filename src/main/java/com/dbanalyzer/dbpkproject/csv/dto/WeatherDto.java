package com.dbanalyzer.dbpkproject.csv.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.Data;

@Data
@JGlobalMap
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherDto {

    @JsonProperty("Weather_Timestamp")
    private String weatherTimestamp;

    @JsonProperty("Wind_Direction")
    private String windDirection;

    @JsonProperty("Weather_Condition")
    private String weatherCondition;

}