package io.ace.springframework.core.eventhandling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventApplicationConfig {

    @Bean
    public CSStartEventHandler csStartEventHandler() {
        return new CSStartEventHandler();
    }

    @Bean
    public EventHelloWorld eventHelloWorld() {
        return new EventHelloWorld();
    }

}
