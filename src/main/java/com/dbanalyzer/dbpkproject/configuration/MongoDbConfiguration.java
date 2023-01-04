package com.dbanalyzer.dbpkproject.configuration;

import com.mongodb.ConnectionString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.mongo.MongoClientSettingsBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "com.dbanalyzer.dbpkproject")
@EnableTransactionManagement
@EnableMongoRepositories(basePackages = {"com.dbanalyzer.dbpkproject.database.mongo.repository"})
public class MongoDbConfiguration {

    @Bean
    public MongoClientSettingsBuilderCustomizer customizer(@Value("${spring.mongo.datasource.uri}") String uri) {
        ConnectionString connectionString = new ConnectionString(uri);
        return settings -> settings.applyConnectionString(connectionString);
    }
}
