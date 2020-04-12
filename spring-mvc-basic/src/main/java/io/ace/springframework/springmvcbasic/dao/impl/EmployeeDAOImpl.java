package io.ace.springframework.springmvcbasic.dao.impl;


import io.ace.springframework.springmvcbasic.dao.EmployeeDAO;
import io.ace.springframework.springmvcbasic.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Employee employee) {
        String insertSql = "INSERT INTO employee(first_name,last_name,age,status) VALUES (?,?,?,?)";
        return jdbcTemplate.update(insertSql, employee.getFirstName(), employee.getLastName(), employee.getAge(), employee.getStatus());
    }

    @Override
    public List<Employee> getAll() {
        String getAllSql = "SElECT * from employee";
        return jdbcTemplate.query(getAllSql, getStudentRowMapper());
    }

    private RowMapper<Employee> getStudentRowMapper() {
        return (ResultSet rs, int row) -> {
            Employee employee = new Employee();
            employee.setId(rs.getInt("id"));
            employee.setFirstName(rs.getString("first_name"));
            employee.setLastName(rs.getString("last_name"));
            employee.setAge(rs.getInt("age"));
            employee.setStatus(rs.getBoolean("status"));
            return employee;
        };
    }

}
