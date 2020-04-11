package io.ace.springframework.core;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println(helloWorld.getMessage());

        CustomBeanPostProcessor myBeanPostProcessor = applicationContext.getBean(CustomBeanPostProcessor.class);
        System.out.println(myBeanPostProcessor);
        applicationContext.registerShutdownHook();
    }
}
