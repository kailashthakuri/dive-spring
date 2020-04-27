package io.ace.springframework.mvc.dao;

import io.ace.springframework.mvc.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonDAO {
    public Optional<Person> getPerson(int id);

    public List<Person> getAllPerson();

    public Person createPerson(Person person);
}
