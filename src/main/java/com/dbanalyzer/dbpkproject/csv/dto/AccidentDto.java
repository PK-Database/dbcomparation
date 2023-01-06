package com.dbanalyzer.dbpkproject.csv.dto;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.*;

import java.time.LocalDateTime;

@Builder(toBuilder = true)
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
@JGlobalMap(excluded = "id")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccidentDto {

    private String id;

    @JsonProperty("Severity")
    private Integer severity;

    @JsonProperty("Distance(mi)")
    private String distance;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Start_Time")
    @JsonPropertyDescription("Shows end time of the accident in local time zone. End time here refers to when the impact of accident on traffic flow was dismissed.")
    @JsonFormat(pattern = "dd.MM.yyyy HH:mm")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime startTime;

    @JsonProperty("End_Time")
    @JsonFormat(pattern = "dd.MM.yyyy HH:mm")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime endTime;

    @JsonUnwrapped
    private LocationDto location;

    @JsonUnwrapped
    private WeatherDto weather;

    @JsonUnwrapped
    private RoadDetailsDto roadDetails;

}