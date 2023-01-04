package com.dbanalyzer.dbpkproject.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.CqlSessionFactoryBean;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.mapping.BasicCassandraMappingContext;
import org.springframework.data.cassandra.core.mapping.CassandraMappingContext;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Objects;

@Configuration
@EnableCassandraRepositories(
        basePackages = {"com.dbanalyzer.dbpkproject.database.cassandra.repository"})
@ComponentScan(basePackages = "com.dbanalyzer.dbpkproject")
@EnableTransactionManagement
public class CassandraDbConfiguration extends AbstractCassandraConfiguration {

    @Value("${spring.cassandra.namespace}")
    private String namespace;

    @Value("${spring.cassandra.datasource.port}")
    private Integer port;

    @Value("${spring.cassandra.datasource.uri}")
    private String address;

    @Override
    protected String getKeyspaceName() {
        return "public";
    }

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

    @Bean
    public CassandraOperations cassandraOperations() {
        return new CassandraTemplate(Objects.requireNonNull(cassandraSession().getObject()));
    }
//    @Bean
//    public CqlSessionFactoryBean session() {
//
//        CqlSessionFactoryBean session = new CqlSessionFactoryBean();
//        session.setContactPoints(address);
//        session.setPort(port);
//        session.setKeyspaceName(namespace);
//
//        return session;
//    }
//
//    @Bean
//    public CassandraMappingContext cassandraMapping() {
//        return new BasicCassandraMappingContext();
//    }
}
