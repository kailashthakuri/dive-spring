package io.ace.springframework.transaction.service;

import io.ace.springframework.transaction.model.Person;

import java.util.List;

public interface PersonService {
    public List<Person> getAllPerson();

    public void createPerson(Person person);
}
