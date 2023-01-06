package com.dbanalyzer.dbpkproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude ={org.springframework.boot.autoconfigure.data.cassandra.CassandraRepositoriesAutoConfiguration.class, org.springframework.boot.autoconfigure.data.jdbc.JdbcRepositoriesAutoConfiguration.class})
public class DbPkProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbPkProjectApplication.class, args);
	}

}
