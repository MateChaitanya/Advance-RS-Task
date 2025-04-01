package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public void addEmployee(Employee employee) {
        String sql = "INSERT INTO employees (id, name, department, salary) VALUES (:id, :name, :department, :salary)";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", employee.getId());
        params.addValue("name", employee.getName());
        params.addValue("department", employee.getDepartment());
        params.addValue("salary", employee.getSalary());

        jdbcTemplate.update(sql, params);
    }

    @Override
    public List<Employee> getAllEmployees() {
        String sql = "SELECT * FROM employees";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));
    }

    @Override
    public Employee getEmployeeById(int id) {
        String sql = "SELECT * FROM employees WHERE id = :id";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);
        return jdbcTemplate.queryForObject(sql, params, new BeanPropertyRowMapper<>(Employee.class));
    }
}
