package io.ace.springframework.springmvcbasic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan(basePackages = {"io.ace.springframework.springmvcbasic.controller"})
@Configuration
public class DispatcherServletConfig {
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/pages/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
