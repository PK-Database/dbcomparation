package com.dbanalyzer.dbpkproject.configuration;

import com.mongodb.ConnectionString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.mongo.MongoClientSettingsBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Configuration

@Import({MainConfiguration.class})
public class MongoDbConfiguration {

    @Bean
    public MongoClientSettingsBuilderCustomizer customizer(@Value("${spring.mongo.datasource.uri}") String uri){
        ConnectionString connectionString = new ConnectionString(uri);
        return settings -> settings.applyConnectionString(connectionString);
    }
}
