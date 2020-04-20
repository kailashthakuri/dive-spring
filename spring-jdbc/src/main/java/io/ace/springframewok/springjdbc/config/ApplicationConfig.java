package io.ace.springframewok.springjdbc.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@ComponentScan(basePackages = {
        "io.ace.springframewok.springjdbc.dao",
        "io.ace.springframewok.springjdbc.storedprcedure"
})
@Configuration
public class ApplicationConfig {

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
        /*
        case insensitive  lookup or instruct spring to use a LinkedCaseInsensitiveMap.
         */
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        return jdbcTemplate;
    }


    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate() {
        return new NamedParameterJdbcTemplate(dataSource());
    }


    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_core?serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setPassword("");
        return dataSource;
    }

}
