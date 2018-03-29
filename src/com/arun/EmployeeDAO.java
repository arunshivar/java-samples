package com.arun;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAO {

    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(Employee employee) {

        String sql = "insert into employee(name,salary,designation) values('" + employee.getName() + "'," + employee.getSalary() + ",'" + employee.getDesignation() + "')";
        return jdbcTemplate.update(sql);
    }

    public List<Employee> getEmployees() {
        return jdbcTemplate.query("select * from employee", new RowMapper<Employee>() {
            public Employee mapRow(ResultSet rs, int row) throws SQLException {
                Employee employee = new Employee();
                employee.setId(rs.getInt(1));
                employee.setName(rs.getString(2));
                employee.setSalary(rs.getFloat(3));
                employee.setDesignation(rs.getString(4));
                return employee;
            }
        });
    }
}
