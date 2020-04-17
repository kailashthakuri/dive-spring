package io.ace.springframework.core.ioc.di.lookupmethod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LookUpMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(LookUpAppConfig.class);
        StudentServices studentServie = applicationContext.getBean(StudentServices.class);

        System.out.println(studentServie);

    }
}
