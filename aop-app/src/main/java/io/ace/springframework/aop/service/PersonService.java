package io.ace.springframework.aop.service;

import io.ace.springframework.aop.model.Person;

public interface PersonService {
    Person getPerson(String name, int age);
}
