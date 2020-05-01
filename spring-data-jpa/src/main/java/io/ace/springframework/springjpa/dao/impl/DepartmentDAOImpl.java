package io.ace.springframework.springjpa.dao.impl;

import io.ace.springframework.springjpa.dao.DepartmentDAO;
import io.ace.springframework.springjpa.entity.Department;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Department save(Department department) {
        entityManager.persist(department);
        entityManager.close();
        return department;
    }
}
