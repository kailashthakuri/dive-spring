package io.ace.springframework.core.ioc.eventhandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventHandlingMainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext appContext = new AnnotationConfigApplicationContext(EventApplicationConfig.class);
        appContext.start();
        EventHelloWorld helloWorld = appContext.getBean(EventHelloWorld.class);
        helloWorld.setMessage("Hi");
        System.out.println(helloWorld.getMessage());
    }
}
