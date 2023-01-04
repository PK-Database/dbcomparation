package com.dbanalyzer.dbpkproject.manager;

import com.dbanalyzer.dbpkproject.manager.dto.AccidentDto;

import java.util.Collection;

public interface DataBaseService {

    Collection<AccidentDto> getAccidents();
}
