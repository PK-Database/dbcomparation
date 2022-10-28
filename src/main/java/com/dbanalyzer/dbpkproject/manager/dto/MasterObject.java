package com.dbanalyzer.dbpkproject.manager.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@RequiredArgsConstructor
@Builder
@Getter
@AllArgsConstructor
public class MasterObject {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("Severity")
    private Date severity;
    @JsonProperty("Start_Time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;
    @JsonProperty("End_Time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;
    @JsonProperty("Start_Lat")
    private BigDecimal startLatitude;
    @JsonProperty("Start_Lng")
    private BigDecimal startLongitude;
    @JsonProperty("End_Lat")
    private BigDecimal endLatitude;
    @JsonProperty("End_Lng")
    private BigDecimal endLongitude;
    @JsonProperty("Distance(mi)")
    private BigDecimal distance;
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date weatherTimestamp;
    @JsonProperty("Temperature(F)")
    private BigDecimal temperature;
    @JsonProperty("Wind_Chill(F)")
    private BigDecimal windChill;
    @JsonProperty("Humidity(%)")
    private BigDecimal humidity;
    @JsonProperty("Pressure(in)")
    private BigDecimal pressure;
    @JsonProperty("Visibility(mi)")
    private BigDecimal visibility;
    @JsonProperty("Wind_Direction")
    private String windDirection;
    @JsonProperty("Wind_Speed(mph)")
    private BigDecimal windSpeed;
    @JsonProperty("Precipitation(in)")
    private BigDecimal precipitation;
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
