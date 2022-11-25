package com.dbanalyzer.dbpkproject.manager;


import com.dbanalyzer.dbpkproject.manager.dto.MasterObject;
import com.dbanalyzer.dbpkproject.postgres.entity.*;
import com.dbanalyzer.dbpkproject.postgres.services.PostgresRepositoryFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Slf4j
public class PropertiesConverterPostgres {

    private final PostgresRepositoryFactory postgresRepositoryFactory;

    public void convertAndSave(MasterObject masterObject, Class cls){
        log.info("POSTGRES:::::Saving " + masterObject.getCity() + " to db");
        switch (cls.getName()){
            case "com.dbanalyzer.dbpkproject.postgres.entity.TableOne":
                postgresRepositoryFactory.getRepository(cls).save(convertTableOne(masterObject));
                break;
            case "com.dbanalyzer.dbpkproject.postgres.entity.TableTwo":
                postgresRepositoryFactory.getRepository(cls).save(convertTableTwo(masterObject));
                break;
            case "com.dbanalyzer.dbpkproject.postgres.entity.TableThree":
                postgresRepositoryFactory.getRepository(cls).save(convertTableThree(masterObject));
                break;
            case "com.dbanalyzer.dbpkproject.postgres.entity.TableFour":
                postgresRepositoryFactory.getRepository(cls).save(convertTableFour(masterObject));
                break;
            case "com.dbanalyzer.dbpkproject.postgres.entity.TableFive":
                postgresRepositoryFactory.getRepository(cls).save(convertTableFive(masterObject));
                break;
            case "com.dbanalyzer.dbpkproject.postgres.entity.TableSix":
                postgresRepositoryFactory.getRepository(cls).save(convertTableSix(masterObject));
                break;
            case "com.dbanalyzer.dbpkproject.postgres.entity.TableSeven":
                postgresRepositoryFactory.getRepository(cls).save(convertTableSeven(masterObject));
                break;
            case "com.dbanalyzer.dbpkproject.postgres.entity.TableEight":
                postgresRepositoryFactory.getRepository(cls).save(convertTableEight(masterObject));
                break;
            default:
                throw new IllegalStateException("Operation not supported");
        }

    }

    public TableOne convertTableOne (MasterObject masterObject) {

        return TableOne.builder()
                .endTime(masterObject.getEndTime())
                .severity(masterObject.getSeverity())
                .startLatitude(masterObject.getStartLatitude())
                .startLongitude(masterObject.getStartLongitude())
                .startTime(masterObject.getStartTime())
                .build();

    }

    public TableTwo convertTableTwo(MasterObject masterObject) {

        return TableTwo.builder()
                .description(masterObject.getDescription())
                .distance(masterObject.getDistance())
                .endLatitude(masterObject.getEndLatitude())
                .endLongitude(masterObject.getEndLongitude())
                .number(masterObject.getNumber())
                .build();
    }

    public TableThree convertTableThree(MasterObject masterObject){

        return TableThree.builder()
                .city(masterObject.getCity())
                .county(masterObject.getCounty())
                .side(masterObject.getSide())
                .street(masterObject.getStreet())
                .zipCode(masterObject.getZipCode())
                .build();
    }

    public TableFour convertTableFour(MasterObject masterObject){

        return TableFour.builder()
                .airportCode(masterObject.getAirportCode())
                .country(masterObject.getCountry())
                .state(masterObject.getState())
                .timeZone(masterObject.getTimeZone())
                .weatherTimestamp(masterObject.getWeatherTimestamp())
                .build();
    }

    public TableFive convertTableFive(MasterObject masterObject){

        return TableFive.builder()
                .amenity(masterObject.getAmenity())
                .bump(masterObject.getBump())
                .crossing(masterObject.getCrossing())
                .weatherCondition(masterObject.getWeatherCondition())
                .windDirection(masterObject.getWindDirection())
                .build();
    }

    public TableSix convertTableSix(MasterObject masterObject){

        return TableSix.builder()
                .giveWay(masterObject.getGiveWay())
                .junction(masterObject.getJunction())
                .noExit(masterObject.getNoExit())
                .railway(masterObject.getRailway())
                .roundabout(masterObject.getRoundabout())
                .build();
    }

    public TableSeven convertTableSeven(MasterObject masterObject){

        return TableSeven.builder()
                .station(masterObject.getStation())
                .stop(masterObject.getStop())
                .trafficCalming(masterObject.getTrafficCalming())
                .trafficSignal(masterObject.getTrafficSignal())
                .turningLoop(masterObject.getTurningLoop())
                .build();
    }

    public TableEight convertTableEight(MasterObject masterObject){

        return TableEight.builder()
                .astronomicalTwilight(masterObject.getAstronomicalTwilight())
                .civilTwilight(masterObject.getCivilTwilight())
                .nauticalTwilight(masterObject.getNauticalTwilight())
                .sunriseSunset(masterObject.getSunriseSunset())
                .build();
    }


}
