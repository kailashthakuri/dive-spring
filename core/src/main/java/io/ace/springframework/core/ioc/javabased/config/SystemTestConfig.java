package io.ace.springframework.core.ioc.javabased.config;

import io.ace.springframework.core.ioc.javabased.config.datasource.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({RepositoryConfig.class, ServiceConfig.class})
public class SystemTestConfig {

    @Bean
    public DataSource dataSource() {
        return new DataSource();
    }
}
