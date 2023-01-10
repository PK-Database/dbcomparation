package com.dbanalyzer.dbpkproject.database.mongo.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.Serializable;

@Data
@Document("RoleKey")
public class RoleKey implements Serializable {

    @Id
    private Long actorId;

    private Long movieId;
}
