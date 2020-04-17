package io.ace.springframework.core.ioc.annotationbased;

import io.ace.springframework.core.ioc.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
    @Qualifier("person1")
    @Autowired
    private Person person;

    public Person getPerson() {
        return person;
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("Profile#init method called.");
//    }
//    @PreDestroy
//    public void destroy() {
//        System.out.println("Profile#destroy method called.");
//    }

}
