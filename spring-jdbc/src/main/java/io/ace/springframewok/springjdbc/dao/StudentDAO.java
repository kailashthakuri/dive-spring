package io.ace.springframewok.springjdbc.dao;

import io.ace.springframewok.springjdbc.model.Student;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {

    public void setDataSource(DataSource dataSource);

    public Student getStudent(Integer id);

    public void createStudent(Student student);

    public List<Student> getStudents();

    public void deleteStudent(Integer id);

    public void updateStudent(Integer id, Student student);

}
