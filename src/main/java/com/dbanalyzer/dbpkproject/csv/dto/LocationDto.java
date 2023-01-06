package com.dbanalyzer.dbpkproject.csv.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.*;

@Builder(toBuilder = true)
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
@JGlobalMap
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationDto {

    @JsonUnwrapped
    private StartGeoPointDto startGeoPoint;

    @JsonUnwrapped
    private EndGeoPointDto endGeoPoint;

    @JsonProperty("Street")
    private String street;

    @JsonProperty("Number")
    @JsonPropertyDescription("The street number in address field")
    private String number;

    @JsonProperty("City")
    private String city;

    @JsonProperty("County")
    private String county;

    @JsonProperty("Zipcode")
    private String zipCode;

    @JsonProperty("State")
    private String state;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("Timezone")
    private String timeZone;

    @JsonProperty("Airport_Code")
    private String airportCode;

}