package io.ace.springsecurity.casclientapp.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@Import(WebSecurityConfig.class)
@ComponentScan(basePackages = "io.ace.springsecurity.casclientapp")
public class ApplicationConfig {

//
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_security?serverTimezone=UTC");
//        dataSource.setUsername("root");
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setPassword("");
//        return dataSource;
//    }

}
