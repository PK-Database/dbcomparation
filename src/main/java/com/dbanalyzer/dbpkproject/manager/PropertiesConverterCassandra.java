//package com.dbanalyzer.dbpkproject.manager;
//
//import com.dbanalyzer.dbpkproject.cassandra.services.CassandraRepositoryFactory;
//import com.dbanalyzer.dbpkproject.manager.dto.AccidentDto;
//import com.dbanalyzer.dbpkproject.cassandra.entity.*;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//
//@RequiredArgsConstructor
//@Component
//@Slf4j
//public class PropertiesConverterCassandra {
//
//    private final CassandraRepositoryFactory cassandraRepositoryFactory;
//
//    public void convertAndSave(AccidentDto accidentDto, Class cls){
//        log.info("CASSANDRA:::::Saving " + accidentDto.getCity() + " to db");
//        switch (cls.getName()){
//            case "com.dbanalyzer.dbpkproject.cassandra.entity.TableOne":
//                cassandraRepositoryFactory.getRepository(cls).save(convertTableOne(accidentDto));
//                break;
//            case "com.dbanalyzer.dbpkproject.cassandra.entity.TableTwo":
//                cassandraRepositoryFactory.getRepository(cls).save(convertTableTwo(accidentDto));
//                break;
//            case "com.dbanalyzer.dbpkproject.cassandra.entity.TableThree":
//                cassandraRepositoryFactory.getRepository(cls).save(convertTableThree(accidentDto));
//                break;
//            case "com.dbanalyzer.dbpkproject.cassandra.entity.TableFour":
//                cassandraRepositoryFactory.getRepository(cls).save(convertTableFour(accidentDto));
//                break;
//            case "com.dbanalyzer.dbpkproject.cassandra.entity.TableFive":
//                cassandraRepositoryFactory.getRepository(cls).save(convertTableFive(accidentDto));
//                break;
//            case "com.dbanalyzer.dbpkproject.cassandra.entity.TableSix":
//                cassandraRepositoryFactory.getRepository(cls).save(convertTableSix(accidentDto));
//                break;
//            case "com.dbanalyzer.dbpkproject.cassandra.entity.TableSeven":
//                cassandraRepositoryFactory.getRepository(cls).save(convertTableSeven(accidentDto));
//                break;
//            case "com.dbanalyzer.dbpkproject.cassandra.entity.TableEight":
//                cassandraRepositoryFactory.getRepository(cls).save(convertTableEight(accidentDto));
//                break;
//            default:
//                throw new IllegalStateException("Operation not supported");
//        }
//
//    }
//
//    public TableOne convertTableOne (AccidentDto accidentDto) {
//
//        return TableOne.builder()
//                .endTime(accidentDto.getEndTime())
//                .severity(accidentDto.getSeverity())
//                .startLatitude(accidentDto.getStartLatitude())
//                .startLongitude(accidentDto.getStartLongitude())
//                .startTime(accidentDto.getStartTime())
//                .build();
//
//    }
//
//    public TableTwo convertTableTwo(AccidentDto accidentDto) {
//
//        return TableTwo.builder()
//                .description(accidentDto.getDescription())
//                .distance(accidentDto.getDistance())
//                .endLatitude(accidentDto.getEndLatitude())
//                .endLongitude(accidentDto.getEndLongitude())
//                .number(accidentDto.getNumber())
//                .build();
//    }
//
//    public TableThree convertTableThree(AccidentDto accidentDto){
//
//        return TableThree.builder()
//                .city(accidentDto.getCity())
//                .county(accidentDto.getCounty())
//                .side(accidentDto.getSide())
//                .street(accidentDto.getStreet())
//                .zipCode(accidentDto.getZipCode())
//                .build();
//    }
//
//    public TableFour convertTableFour(AccidentDto accidentDto){
//
//        return TableFour.builder()
//                .airportCode(accidentDto.getAirportCode())
//                .country(accidentDto.getCountry())
//                .state(accidentDto.getState())
//                .timeZone(accidentDto.getTimeZone())
//                .weatherTimestamp(accidentDto.getWeatherTimestamp())
//                .build();
//    }
//
//    public TableFive convertTableFive(AccidentDto accidentDto){
//
//        return TableFive.builder()
//                .amenity(accidentDto.getAmenity())
//                .bump(accidentDto.getBump())
//                .crossing(accidentDto.getCrossing())
//                .weatherCondition(accidentDto.getWeatherCondition())
//                .windDirection(accidentDto.getWindDirection())
//                .build();
//    }
//
//    public TableSix convertTableSix(AccidentDto accidentDto){
//
//        return TableSix.builder()
//                .giveWay(accidentDto.getGiveWay())
//                .junction(accidentDto.getJunction())
//                .noExit(accidentDto.getNoExit())
//                .railway(accidentDto.getRailway())
//                .roundabout(accidentDto.getRoundabout())
//                .build();
//    }
//
//    public TableSeven convertTableSeven(AccidentDto accidentDto){
//
//        return TableSeven.builder()
//                .station(accidentDto.getStation())
//                .stop(accidentDto.getStop())
//                .trafficCalming(accidentDto.getTrafficCalming())
//                .trafficSignal(accidentDto.getTrafficSignal())
//                .turningLoop(accidentDto.getTurningLoop())
//                .build();
//    }
//
//    public TableEight convertTableEight(AccidentDto accidentDto){
//
//        return TableEight.builder()
//                .astronomicalTwilight(accidentDto.getAstronomicalTwilight())
//                .civilTwilight(accidentDto.getCivilTwilight())
//                .nauticalTwilight(accidentDto.getNauticalTwilight())
//                .sunriseSunset(accidentDto.getSunriseSunset())
//                .build();
//    }
//}
