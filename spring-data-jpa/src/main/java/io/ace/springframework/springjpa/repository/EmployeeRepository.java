package io.ace.springframework.springjpa.repository;

import io.ace.springframework.springjpa.SearchDTO;
import io.ace.springframework.springjpa.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface EmployeeRepository extends CrudRepository<Employee, Long>, QueryByExampleExecutor<Employee> {

}
