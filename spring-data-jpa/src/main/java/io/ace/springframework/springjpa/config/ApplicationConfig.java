package io.ace.springframework.springjpa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@ComponentScan(basePackages = "io.ace.springframework.springjpa")
@EnableTransactionManagement
@Import(PersitenceConfig.class)
public class ApplicationConfig {

}
