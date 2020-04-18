package io.ace.springframework.aop.service.impl;

import io.ace.springframework.aop.model.Person;
import io.ace.springframework.aop.service.PersonService;

public class PersonServiceImpl implements PersonService {

    @Override
    public Person getPerson(String personName, int age) {
        return new Person(personName, age);
    }
}
