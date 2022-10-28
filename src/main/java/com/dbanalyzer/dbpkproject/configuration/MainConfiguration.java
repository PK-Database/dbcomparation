package com.dbanalyzer.dbpkproject.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "com.dbanalyzer.dbpkproject")
@EnableTransactionManagement
public class MainConfiguration {

}
