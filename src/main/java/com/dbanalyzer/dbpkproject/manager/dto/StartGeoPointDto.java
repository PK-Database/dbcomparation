package com.dbanalyzer.dbpkproject.manager.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.Data;

@Data
@JGlobalMap
@JsonIgnoreProperties(ignoreUnknown = true)
public class StartGeoPointDto {

    @JsonProperty("Start_Lat")
    private String latitude;

    @JsonProperty("Start_Lng")
    private String longitude;

}