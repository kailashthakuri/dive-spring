package io.ace.springframework.core.customevent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomMainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext appContext = new AnnotationConfigApplicationContext(CustomApplicationConfig.class);
        CustomEventPublisher customEventPublisher = appContext.getBean(CustomEventPublisher.class);
        customEventPublisher.publish();
        customEventPublisher.publish();
    }
}
