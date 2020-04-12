package io.ace.springframework.springmvcbasic.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.sql.DataSource;


@ComponentScan(basePackages = "io.ace.springframework.springmvcbasic.dao.*")
@Configuration
public class ApplicationConfig {


    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setPassword("");
        dataSource.setUsername("root");
        dataSource.setUrl("jdbc:mysql://localhost:3306/human_resource?serverTimezone=UTC");
        return dataSource;
    }

}
