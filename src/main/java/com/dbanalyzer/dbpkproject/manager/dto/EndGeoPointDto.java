package com.dbanalyzer.dbpkproject.manager.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.Data;

@Data
@JGlobalMap
@JsonIgnoreProperties(ignoreUnknown = true)
public class EndGeoPointDto {

    @JsonProperty("End_Lat")
    private String latitude;

    @JsonProperty("End_Lng")
    private String longitude;

}