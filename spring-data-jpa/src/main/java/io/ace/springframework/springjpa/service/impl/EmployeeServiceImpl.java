package io.ace.springframework.springjpa.service.impl;

import io.ace.springframework.springjpa.SearchDTO;
import io.ace.springframework.springjpa.entity.Employee;
import io.ace.springframework.springjpa.repository.EmployeeRepository;
import io.ace.springframework.springjpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    @Transactional
    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAll() {
        Iterable<Employee> iterable = employeeRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public Employee findById(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.orElse(new Employee());
    }

    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> search(SearchDTO searchDTO) {
        ExampleMatcher exampleMatcher = ExampleMatcher.matchingAny()
                .withNullHandler(ExampleMatcher.NullHandler.IGNORE)
                .withIgnoreCase()
                .withMatcher("firstName", genericPropertyMatcher -> genericPropertyMatcher.contains())
                .withMatcher("age", genericPropertyMatcher -> genericPropertyMatcher.exact())
                .withMatcher("lastName", genericPropertyMatcher -> genericPropertyMatcher.contains());
        Example<Employee> example = Example.of(Employee.getEmployeeBySearchDTO(searchDTO), exampleMatcher);
        Iterable<Employee> all = this.employeeRepository.findAll(example);
        return StreamSupport.stream(all.spliterator(), false)
                .collect(Collectors.toList());
    }
}
