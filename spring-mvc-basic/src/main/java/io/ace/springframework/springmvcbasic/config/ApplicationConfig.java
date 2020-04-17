package io.ace.springframework.springmvcbasic.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


@ComponentScan(basePackages = "io.ace.springframework.springmvcbasic.dao.*")
@PropertySource(value = "classpath:database.properties")
@Configuration
public class ApplicationConfig {


    @Value("jdbc.username")
    String userName;
    @Value("jdbc.url")
    String url;
    @Value("jdbc.password")
    String password;
    @Value("jdbc.driver")
    String driverName;

    @Autowired
    Environment environment;

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        /**
         * first way
         */
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setPassword("");
//        dataSource.setUsername("root");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/human_resource?serverTimezone=UTC");
        /**
         * second way
         */

//        dataSource.setDriverClassName(driverName);
//        dataSource.setPassword(password);
//        dataSource.setUsername(userName);
//        dataSource.setUrl(url);

        /**
         * third way
         */
        dataSource.setDriverClassName(environment.getProperty("jdbc.driver"));
        dataSource.setPassword(environment.getProperty("jdbc.password"));
        dataSource.setUsername(environment.getProperty("jdbc.username"));
        dataSource.setUrl("jdbc.url");

        return dataSource;
    }

}
