package io.ace.springframework.transaction.dao;

import io.ace.springframework.transaction.model.Person;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {
    public void setDataSource(DataSource dataSource);

    public void createRecord(Person person);

    public List<Person> getAllRecords();
}
