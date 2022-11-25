package com.dbanalyzer.dbpkproject.manager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@RequiredArgsConstructor
@Builder
@Getter
@AllArgsConstructor
@ToString
public class MasterObject {

    @JsonProperty("XX")
    private String id;
    @JsonProperty("Severity")
    private Integer severity;
    @JsonProperty("Start_Time")
    private String startTime;
    @JsonProperty("End_Time")
    private String endTime;
    @JsonProperty("Start_Lat")
    private String startLatitude;
    @JsonProperty("Start_Lng")
    private String startLongitude;

    @JsonProperty("End_Lat")
    private String endLatitude;
    @JsonProperty("End_Lng")
    private String endLongitude;
    @JsonProperty("Distance(mi)")
    private String distance;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Number")
    private String number;

    @JsonProperty("Street")
    private String street;
    @JsonProperty("Side")
    private String side;
    @JsonProperty("City")
    private String city;
    @JsonProperty("County")
    private String county;
    @JsonProperty("Zipcode")
    private String zipCode;

    @JsonProperty("Country")
    private String country;
    @JsonProperty("State")
    private String state;
    @JsonProperty("Timezone")
    private String timeZone;
    @JsonProperty("Airport_Code")
    private String airportCode;
    @JsonProperty("Weather_Timestamp")
    private String weatherTimestamp;

    @JsonProperty("Wind_Direction")
    private String windDirection;
    @JsonProperty("Weather_Condition")
    private String weatherCondition;
    @JsonProperty("Amenity")
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
    private Boolean station;
    @JsonProperty("Stop")
    private Boolean stop;
    @JsonProperty("Traffic_Calming")
    private Boolean trafficCalming;
    @JsonProperty("Traffic_Signal")
    private Boolean trafficSignal;
    @JsonProperty("Turning_Loop")
    private Boolean turningLoop;

    @JsonProperty("Sunrise_Sunset")
    private String sunriseSunset;
    @JsonProperty("Civil_Twilight")
    private String civilTwilight;
    @JsonProperty("Nautical_Twilight")
    private String nauticalTwilight;
    @JsonProperty("Astronomical_Twilight")
    private String astronomicalTwilight;


}
