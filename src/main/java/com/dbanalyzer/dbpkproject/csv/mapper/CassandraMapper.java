package com.dbanalyzer.dbpkproject.csv.mapper;

import com.dbanalyzer.dbpkproject.csv.dto.*;
import com.dbanalyzer.dbpkproject.database.cassandra.entity.*;
import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.enums.ChooseConfig;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class CassandraMapper {
    public StartGeoPointDto mapStartGeoToDto(StartGeoPoint entity) {
        JMapper<StartGeoPointDto, StartGeoPoint> mapper = new JMapper<>
            (StartGeoPointDto.class, StartGeoPoint.class, ChooseConfig.SOURCE);

        return mapper.getDestination(entity);
    }
    public EndGeoPointDto mapEndGeoToDto(EndGeoPoint entity) {
        JMapper<EndGeoPointDto, EndGeoPoint> mapper = new JMapper<>
                (EndGeoPointDto.class, EndGeoPoint.class, ChooseConfig.SOURCE);

        return mapper.getDestination(entity);
    }
    public LocationDto mapLocationToDto(Location entity, StartGeoPointDto startGeoPointDto, EndGeoPointDto endGeoPointDto) {
        JMapper<LocationDto, Location> mapper = new JMapper<>
                (LocationDto.class, Location.class, ChooseConfig.SOURCE);
        LocationDto destination = mapper.getDestination(entity);
        destination.setStartGeoPoint(startGeoPointDto);
        destination.setEndGeoPoint(endGeoPointDto);

        return destination;
    }
    public WeatherDto mapWeatherToDto(Weather entity) {
        JMapper<WeatherDto, Weather> mapper = new JMapper<>
                (WeatherDto.class, Weather.class, ChooseConfig.SOURCE);

        return mapper.getDestination(entity);
    }
    public RoadDetailsDto mapRoadDetailsToDto(RoadDetails entity) {
        JMapper<RoadDetailsDto, RoadDetails> mapper = new JMapper<>
                (RoadDetailsDto.class, RoadDetails.class, ChooseConfig.SOURCE);

        return mapper.getDestination(entity);
    }

    public StartGeoPoint mapStartGeoToEntity(String accidentId, StartGeoPointDto dto) {
        JMapper<StartGeoPoint, StartGeoPointDto> mapper = new JMapper<>
                (StartGeoPoint.class, StartGeoPointDto.class, ChooseConfig.DESTINATION);

        StartGeoPoint destination = mapper.getDestination(dto);
        destination.setAccidentId(accidentId);

        return destination;
    }
    public EndGeoPoint mapEndGeoToEntity(String accidentId, EndGeoPointDto dto) {
        JMapper<EndGeoPoint, EndGeoPointDto> mapper = new JMapper<>
                (EndGeoPoint.class, EndGeoPointDto.class, ChooseConfig.DESTINATION);

        EndGeoPoint destination = mapper.getDestination(dto);
        destination.setAccidentId(accidentId);

        return destination;
    }
    public Location mapLocationToEntity(String accidentId, LocationDto dto) {
        JMapper<Location, LocationDto> mapper = new JMapper<>
                (Location.class, LocationDto.class, ChooseConfig.DESTINATION);

        Location destination = mapper.getDestination(dto);
        destination.setAccidentId(accidentId);

        return destination;
    }
    public Weather mapWeatherToEntity(String accidentId, WeatherDto dto) {
        JMapper<Weather, WeatherDto> mapper = new JMapper<>
                (Weather.class, WeatherDto.class, ChooseConfig.DESTINATION);

        Weather destination = mapper.getDestination(dto);
        destination.setAccidentId(accidentId);

        return destination;
    }
    public RoadDetails mapRoadDetailsToEntity(String accidentId, RoadDetailsDto dto) {
        JMapper<RoadDetails, RoadDetailsDto> mapper = new JMapper<>
                (RoadDetails.class, RoadDetailsDto.class, ChooseConfig.DESTINATION);

        RoadDetails destination = mapper.getDestination(dto);
        destination.setAccidentId(accidentId);

        return destination;
    }

    public List<Accident> mapToEntitiesList(List<AccidentDto> dtos) {
        JMapper<Accident, AccidentDto> accidentMapper = new JMapper<>
                (Accident.class, AccidentDto.class, ChooseConfig.DESTINATION);

        return dtos.stream()
                .map(accidentMapper::getDestination)
                .collect(toList());
    }
}
