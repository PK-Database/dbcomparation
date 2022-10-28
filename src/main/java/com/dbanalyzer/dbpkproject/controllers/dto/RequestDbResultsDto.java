package com.dbanalyzer.dbpkproject.controllers.dto;

import com.dbanalyzer.dbpkproject.controllers.enums.DatabaseType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestDbResultsDto {

    private DatabaseType databaseType;

}
