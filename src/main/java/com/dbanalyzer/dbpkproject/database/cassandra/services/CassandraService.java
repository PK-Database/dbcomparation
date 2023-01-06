package com.dbanalyzer.dbpkproject.database.cassandra.services;

import com.dbanalyzer.dbpkproject.csv.dto.AccidentDto;
import com.dbanalyzer.dbpkproject.csv.mapper.CassandraMapper;
import com.dbanalyzer.dbpkproject.database.cassandra.entity.*;
import com.dbanalyzer.dbpkproject.database.cassandra.repository.*;
import com.dbanalyzer.dbpkproject.manager.DataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CassandraService implements DataBaseService {
    private final AccidentCassandraRepository accidentRepository;
    private final WeatherCassandraRepository weatherRepository;
    private final StartGeoPointCassandraRepository startGeoPointRepository;
    private final EndGeoPointCassandraRepository endGeoPointRepository;
    private final RoadDetailsCassandraRepository roadDetailsRepository;
    private final LocationCassandraRepository locationRepository;
    private final CassandraMapper cassandraMapper;

    @Autowired
    public CassandraService(AccidentCassandraRepository accidentRepository,
                            WeatherCassandraRepository weatherRepository,
                            StartGeoPointCassandraRepository startGeoPointRepository,
                            EndGeoPointCassandraRepository endGeoPointRepository,
                            RoadDetailsCassandraRepository roadDetailsRepository,
                            LocationCassandraRepository locationRepository,
                            CassandraMapper cassandraMapper) {
        this.accidentRepository = accidentRepository;
        this.weatherRepository = weatherRepository;
        this.startGeoPointRepository = startGeoPointRepository;
        this.endGeoPointRepository = endGeoPointRepository;
        this.roadDetailsRepository = roadDetailsRepository;
        this.locationRepository = locationRepository;
        this.cassandraMapper = cassandraMapper;
    }
    public void save(List<AccidentDto> accidentDtos) {
        List<Accident> accidents = cassandraMapper.mapToEntitiesList(accidentDtos);

        List<StartGeoPoint> startGeoPoints = accidentDtos.stream()
                .map(accidentDto -> cassandraMapper.mapStartGeoToEntity(accidentDto.getId(), accidentDto.getLocation().getStartGeoPoint()))
                .collect(Collectors.toList());

        List<EndGeoPoint> endGeoPoints = accidentDtos.stream()
                .map(accidentDto -> cassandraMapper.mapEndGeoToEntity(accidentDto.getId(), accidentDto.getLocation().getEndGeoPoint()))
                .collect(Collectors.toList());

        List<Location> locations = accidentDtos.stream()
                .map(accidentDto -> cassandraMapper.mapLocationToEntity(accidentDto.getId(), accidentDto.getLocation()))
                .collect(Collectors.toList());

        List<RoadDetails> roadDetails = accidentDtos.stream()
                .map(accidentDto -> cassandraMapper.mapRoadDetailsToEntity(accidentDto.getId(), accidentDto.getRoadDetails()))
                .collect(Collectors.toList());

        List<Weather> weathers = accidentDtos.stream()
                .map(accidentDto -> cassandraMapper.mapWeatherToEntity(accidentDto.getId(), accidentDto.getWeather()))
                .collect(Collectors.toList());

        accidentRepository.saveAll(accidents);
        startGeoPointRepository.saveAll(startGeoPoints);
        endGeoPointRepository.saveAll(endGeoPoints);
        locationRepository.saveAll(locations);
        roadDetailsRepository.saveAll(roadDetails);
        weatherRepository.saveAll(weathers);
    }

    @Override
    public Collection<AccidentDto> getAccidents() {

        return accidentRepository.findAll().stream().map(accident -> AccidentDto.builder()
                        .id(accident.getId())
                        .severity(accident.getSeverity())
                        .distance(accident.getDistance())
                        .description(accident.getDescription())
                        .startTime(accident.getStartTime())
                        .endTime(accident.getEndTime())
                        .location(cassandraMapper.mapLocationToDto(locationRepository.findByAccidentId(accident.getId()),
                                cassandraMapper.mapStartGeoToDto(startGeoPointRepository.findByAccidentId(accident.getId())),
                                cassandraMapper.mapEndGeoToDto(endGeoPointRepository.findByAccidentId(accident.getId()))))
                        .weather(cassandraMapper.mapWeatherToDto(weatherRepository.findByAccidentId(accident.getId())))
                        .roadDetails(cassandraMapper.mapRoadDetailsToDto(roadDetailsRepository.findByAccidentId(accident.getId())))
                        .build()
                ).collect(Collectors.toList());
    }
}
