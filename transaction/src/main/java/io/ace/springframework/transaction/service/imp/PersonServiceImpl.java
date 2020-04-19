package io.ace.springframework.transaction.service.imp;


import io.ace.springframework.transaction.dao.PersonDAO;
import io.ace.springframework.transaction.model.Person;
import io.ace.springframework.transaction.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDAO personDAO;

    @Override
    public List<Person> getAllPerson() {
        return this.personDAO.getAllRecords();
    }

    @Override
    public void createPerson(Person person) {
        personDAO.createRecord(person);
    }
}
