package com.example;

import java.util.List;

public interface EmployeeDAO {
    void addEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
}
