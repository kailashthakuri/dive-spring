package io.ace.springframewok.springjdbc.dao;

import io.ace.springframewok.springjdbc.model.Employee;

import java.util.Collection;
import java.util.List;

public interface EmployeeDAO {

    /*
    queries
    */
    int getCount();

    int getCountByDepartment(String departmentName);

    int getCountByLastName(String lastName);

    int getCountByBean(Employee employee);

    List<Employee> getAllEmployees();

    /*
    update
     */
    int insertEmployee(Employee employee);

    int[] batchInsert(List<Employee> employees);

    int[] batchUpdate(List<Employee> employees);

    int[][] batchUpdateCollection(Collection<Employee> employees);

    int[] batchUpdateWithNamed(List<Employee> employees);

}
