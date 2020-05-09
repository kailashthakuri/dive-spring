package io.ace.springframework.springbootapp.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ConfigurableApplicationContext;

public class ApplicationReadyEventListener extends ApplicationReadyEvent {

    public ApplicationReadyEventListener(SpringApplication application, String[] args, ConfigurableApplicationContext context) {
        super(application, args, context);
    }

    @Override
    public ConfigurableApplicationContext getApplicationContext() {
        return super.getApplicationContext();
    }
}
