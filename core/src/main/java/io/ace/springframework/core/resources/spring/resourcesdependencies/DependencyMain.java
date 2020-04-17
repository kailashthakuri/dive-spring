package io.ace.springframework.core.resources.spring.resourcesdependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/dependencyConfig.xml");
        DataReader dataReader = context.getBean(DataReader.class);
        System.out.println("------------ Personal Detail -----------------");
        dataReader.getUserInfo().forEach((String key, String value) -> {
            System.out.println(key + " : " + value);
        });
    }
}
