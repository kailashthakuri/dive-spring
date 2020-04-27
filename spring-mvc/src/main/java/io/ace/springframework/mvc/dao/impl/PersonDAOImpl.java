package io.ace.springframework.mvc.dao.impl;

import io.ace.springframework.mvc.dao.PersonDAO;
import io.ace.springframework.mvc.model.Person;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class PersonDAOImpl implements PersonDAO {

    public static List<Person> personList = Arrays.asList(new Person(1, "kailash", 34, "Kalanki"),
            new Person(2, "Ashok", 56, "Kohalpur"),
            new Person(3, "Kshitij", 23, "Lalitpur"));

    @Override
    public Optional<Person> getPerson(int id) {
        return personList.stream().filter(person -> person.getId() == id).findFirst();
    }

    @Override
    public List<Person> getAllPerson() {
        return personList;
    }

    @Override
    public Person createPerson(Person person) {
        personList.add(person);
        return person;
    }
}
