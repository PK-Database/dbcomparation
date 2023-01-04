package com.dbanalyzer.dbpkproject.csv.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.Data;

@Data
@JGlobalMap
@JsonIgnoreProperties(ignoreUnknown = true)
public class StartGeoPointDto {

    @JsonProperty("Start_Lat")
    private Float latitude;

    @JsonProperty("Start_Lng")
    private Float longitude;

}