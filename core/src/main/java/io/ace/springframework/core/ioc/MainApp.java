package io.ace.springframework.core.ioc;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Messenger helloWorld = (Messenger) applicationContext.getBean("helloWorld");
        System.out.println(helloWorld.getMessage());
    }
}
