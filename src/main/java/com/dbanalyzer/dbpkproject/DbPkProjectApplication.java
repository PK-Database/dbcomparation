package com.dbanalyzer.dbpkproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.data.cassandra.CassandraRepositoriesAutoConfiguration.class, org.springframework.boot.autoconfigure.data.jdbc.JdbcRepositoriesAutoConfiguration.class})
@EnableSwagger2
public class DbPkProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbPkProjectApplication.class, args);
	}
}
