package io.ace.springframework.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = appContext.getBean(HelloWorld.class);
        helloWorld.setMessage("Hello World");
        System.out.println(helloWorld.getMessage());
    }
}
