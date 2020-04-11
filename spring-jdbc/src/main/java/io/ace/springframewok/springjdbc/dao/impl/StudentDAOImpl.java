package io.ace.springframewok.springjdbc.dao.impl;

import io.ace.springframewok.springjdbc.dao.StudentDAO;
import io.ace.springframewok.springjdbc.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public class StudentDAOImpl implements StudentDAO {
    private DataSource dataSource;
    private SimpleJdbcCall simpleJdbcCall;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.simpleJdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("spGetStudentById");
    }

    @Override
    public Student getStudent(Integer id) {
        String selectQuery = "select * from student where id = ?";
//        Student student = this.jdbcTemplate.queryForObject(selectQuery, new Object[]{id}, getStudentRowMapper());
//        SqlParameterSource sqlParameterSource = new MapSqlParameterSource("in_id", id);
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource().addValue("in_id", id);
        Map<String, Object> result = this.simpleJdbcCall.execute(Map.of("in_id", id));
//        Map<String, Object> result = this.simpleJdbcCall.execute(sqlParameterSource);
        Student student = new Student();
        student.setName(String.valueOf(result.get("out_name")));
        student.setAge((Integer) (result.get("out_age")));
        student.setId(id);
        return student;
    }

    @Override
    public void createStudent(Student student) {
        String createQuery = "INSERT  INTO Student(name,age) VALUES (?,?)";
        this.jdbcTemplate.update(createQuery, student.getName(), student.getAge());
        System.out.println("Created Record Name: " + student.getName() + ", Age: " + student.getAge());
        return;
    }

    @Override
    public List<Student> getStudents() {
        String selectAllQuery = "SELECT * FROM student";
        List<Student> students = this.jdbcTemplate.query(selectAllQuery, getStudentRowMapper());
        return students;
    }

    @Override
    public void deleteStudent(Integer id) {
        String deleteQuery = "DELETE FROM student where id =?";
        this.jdbcTemplate.update(deleteQuery, id);
        System.out.println("Deleted Record with id : " + id);
        return;
    }

    @Override
    public void updateStudent(Integer id, Student student) {
        String updateQuery = "UPDATE student SET name=? , age=? where id=?";
        this.jdbcTemplate.update(updateQuery, student.getName(), student.getAge(), id);
        return;
    }

    public RowMapper<Student> getStudentRowMapper() {
        return (ResultSet resultSet, int i) -> {
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setAge(resultSet.getInt("age"));
            return student;
        };
    }
}
