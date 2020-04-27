package io.ace.springframework.orm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld bean = context.getBean(HelloWorld.class);
        System.out.println(bean.getMessage());
    }
}
