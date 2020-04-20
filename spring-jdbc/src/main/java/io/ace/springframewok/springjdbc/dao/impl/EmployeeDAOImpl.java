package io.ace.springframewok.springjdbc.dao.impl;

import io.ace.springframewok.springjdbc.dao.EmployeeDAO;
import io.ace.springframewok.springjdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.*;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public int getCount() {
        Integer count = this.jdbcTemplate.queryForObject("select count(*) from employee", Integer.class);
        return count;
    }

    @Override
    public int getCountByDepartment(String departmentName) {
        return jdbcTemplate.queryForObject("SELECT count(*) FROM employee where department = ?", Integer.class, departmentName);
    }

    @Override
    public int getCountByLastName(String lastName) {
        SqlParameterSource source = new MapSqlParameterSource().addValue("last_name", lastName);
        return namedParameterJdbcTemplate.queryForObject("SELECT count(*) FROM employee where last_name=:lastName", Map.of("lastName", lastName), Integer.class);
    }

    @Override
    public int getCountByBean(Employee employee) {
        String query = "SELECT count(*) from employee where " +
                "first_name=:firstName," +
                "last_name=:lastName," +
                "age=:age," +
                "department=:department," +
                "id=:id";
        SqlParameterSource source = new BeanPropertySqlParameterSource(employee);
        return namedParameterJdbcTemplate.queryForObject(query, source, Integer.class);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return jdbcTemplate.query("select * from employee", employeeRowMapper);
    }

    private final RowMapper<Employee> employeeRowMapper = (ResultSet resultSet, int rowNumber) -> {
        Employee employee = new Employee();
        employee.setId(resultSet.getInt("id"));
        employee.setFirstName(resultSet.getString("first_name"));
        employee.setLastName(resultSet.getString("last_name"));
        employee.setDepartment(resultSet.getString("department"));
        employee.setAge(resultSet.getInt("age"));
        employee.setSalary(resultSet.getDouble("salary"));
        return employee;
    };

    @Override
    public int insertEmployee(Employee employee) {
        String query = "INSERT INTO employee(first_name,last_name,age,salary,department) values(?,?,?,?,?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        int update = jdbcTemplate.update(
                connection -> {
                    PreparedStatement preparedStatement = connection.prepareStatement(query, new String[]{"id"});
                    preparedStatement.setString(1, employee.getFirstName());
                    preparedStatement.setString(2, employee.getLastName());
                    preparedStatement.setInt(3, employee.getAge());
                    preparedStatement.setDouble(4, employee.getSalary());
                    preparedStatement.setString(5, employee.getDepartment());
                    return preparedStatement;
                }, keyHolder);
        System.out.println(keyHolder.getKey());
        return update;
    }

    @Override
    public int[] batchInsert(List<Employee> employees) {
        String sql = "INSERT INTO employee(first_name,last_name,age,salary,department) VALUES(?,?,?,?,?)";
        return this.jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                Employee employee = employees.get(i);
                preparedStatement.setString(1, employee.getFirstName());
                preparedStatement.setString(2, employee.getLastName());
                preparedStatement.setInt(3, employee.getAge());
                preparedStatement.setDouble(4, employee.getSalary());
                preparedStatement.setString(5, employee.getDepartment());
            }

            @Override
            public int getBatchSize() {
                return employees.size();
            }
        });
    }

    @Override
    public int[] batchUpdate(List<Employee> employees) {
        String sql = "UPDATE employee set salary=? where id =?";
        List<Object[]> batchArgs = new ArrayList<>();
        employees.forEach(employee -> {
            batchArgs.add(new Object[]{
                    employee.getSalary(),
                    employee.getId()
            });
        });
        System.out.println(batchArgs);
        return this.jdbcTemplate.batchUpdate(sql, batchArgs);
    }

    @Override
    public int[][] batchUpdateCollection(Collection<Employee> employees) {
        String sql = "UPDATE employee set salary=? where id =?";
        return this.jdbcTemplate.batchUpdate(sql, employees, 2, new ParameterizedPreparedStatementSetter<Employee>() {
            @Override
            public void setValues(PreparedStatement preparedStatement, Employee employee) throws SQLException {
                preparedStatement.setDouble(1, employee.getSalary());
                preparedStatement.setInt(2, employee.getId());
            }
        });
    }

    @Override
    public int[] batchUpdateWithNamed(List<Employee> employees) {
        String sql = "UPDATE employee set salary=:salary where id =:id";
        return this.namedParameterJdbcTemplate.batchUpdate(sql, SqlParameterSourceUtils.createBatch(employees));
    }
}
