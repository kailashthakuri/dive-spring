package io.ace.springframework.core.ioc.environment;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

@Configuration
public class AppConfig {

    @Bean
    @Development  // @Profile("development')
    public DataSource standaloneDataSource() {
        EmbeddedDatabase dataSource = new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.HSQL)
                .addScript("")
                .addScript("")
                .build();
        return dataSource;
    }

    @Bean
    @Production  // @Profile("production")
    public DataSource jndiDataSource() throws NamingException {
        Context context = new InitialContext();
        return (DataSource) context.lookup("");
    }
}
