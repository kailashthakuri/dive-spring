package io.ace.springframework.springjpa.service.impl;


import io.ace.springframework.springjpa.dao.DepartmentDAO;
import io.ace.springframework.springjpa.entity.Department;
import io.ace.springframework.springjpa.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentDAO departmentDAO;

    @Transactional
    @Override
    public Department save(Department department) {
        return departmentDAO.save(department);
    }
}
