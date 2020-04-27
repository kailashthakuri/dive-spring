package io.ace.springframework.mvc.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"io.ace.springframework.mvc.dao","io.ace.springframework.mvc.service"})
public class ApplicationConfig {
}
