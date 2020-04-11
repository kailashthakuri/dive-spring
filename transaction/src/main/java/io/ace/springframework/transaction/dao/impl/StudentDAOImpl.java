package io.ace.springframework.transaction.dao.impl;

import io.ace.springframework.transaction.dao.StudentDAO;
import io.ace.springframework.transaction.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    public DataSource dataSource;
    public JdbcTemplate jdbcTemplate;

    @Autowired
    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void createRecord(Person person) {
        try {
            String createPeronQuery = "INSERT INTO person(name,age) values(?,?)";
            String maxCountQuery = "SELECT max(id) from person";
            String createMarksQuery = "INSERT INTO marks(pid,marks,year) values(?,?,?)";
            this.jdbcTemplate.update(createPeronQuery, person.getName(), person.getAge());
            Integer count = this.jdbcTemplate.queryForObject(maxCountQuery, Integer.class);
            System.out.println("COUNT: " + count);
            this.jdbcTemplate.update(createMarksQuery, count, person.getMarks(), person.getYear());
            System.out.println("StudentDAOImpl#createRecord Method Called");
        } catch (Exception e) {
            System.out.println("Exception Raised");
        }
    }

    @Override
    public List<Person> getAllRecords() {
        String selectAllQuery = "SELECT * FROM person,marks where person.id = marks.pid";
        return this.jdbcTemplate.query(selectAllQuery, getPersonMapper());
    }

    private RowMapper<Person> getPersonMapper() {
        return (ResultSet resultSet, int row) -> {
            Person person = new Person();
            person.setId(resultSet.getInt("id"));
            person.setName(resultSet.getString("name"));
            person.setMarks(resultSet.getInt("marks"));
            return person;
        };
    }

}
