package com.dbanalyzer.dbpkproject.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories(
        basePackages = {"com.dbanalyzer.dbpkproject.database.cassandra.repository"})
public class CassandraDbConfiguration extends AbstractCassandraConfiguration {

    @Value("${spring.data.cassandra.keyspace-name}")
    private String keyspace;

    @Value("${spring.data.cassandra.port}")
    private Integer port;

    @Value("${spring.data.cassandra.contact-points}")
    private String contactPoints;

    @Value("${spring.data.cassandra.base-packages}")
    private String basePackages;
    @Override
    protected String getContactPoints() {
        return contactPoints;
    }

    @Override
    protected String getKeyspaceName() {
        return keyspace;
    }

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

    @Override
    protected int getPort() {
        return port;
    }

    @Override
    public String[] getEntityBasePackages() {
        return new String[] {basePackages};
    }


/*    @Bean
    public CassandraOperations cassandraOperations() {
        return new CassandraTemplate(Objects.requireNonNull(cassandraSession().getObject()));
    }*/
}
