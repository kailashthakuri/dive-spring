package io.ace.springframework.springjpa.service;

import io.ace.springframework.springjpa.SearchDTO;
import io.ace.springframework.springjpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);

    List<Employee> findAll();

    Employee findById(Long id);

    void deleteById(Long id);

    List<Employee> search(SearchDTO searchDTO);

}
