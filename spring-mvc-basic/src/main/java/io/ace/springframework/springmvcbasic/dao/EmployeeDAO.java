package io.ace.springframework.springmvcbasic.dao;

import io.ace.springframework.springmvcbasic.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    int insert(Employee employee);

    List<Employee> getAll();
}
