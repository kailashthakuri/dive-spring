package io.ace.springframework.springjpa.dao;

import io.ace.springframework.springjpa.entity.Department;

public interface DepartmentDAO {
    Department save(Department department);
}
