package io.ace.springframework.core.ioc.annotationbased;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoationMainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicatonContext = new ClassPathXmlApplicationContext("annotationConfig.xml");
        Profile profile = applicatonContext.getBean(Profile.class);
        System.out.println(profile.getPerson());
    }
}
