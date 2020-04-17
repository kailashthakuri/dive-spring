package io.ace.springframework.core.ioc.customevent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomApplicationConfig {
    @Bean
    CustomEventPublisher customEventPublisher() {
        return new CustomEventPublisher();
    }


    @Bean
    CustomEventHandler customEventHandler() {
        return new CustomEventHandler();
    }
}
