package com.company.service;

import com.company.dao.EmployeeDAOImpl;
import com.company.model.Employee;
import java.util.List;

public class EmployeeService {
    private EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();

    public void addEmployee(Employee employee) {
        employeeDAO.addEmployee(employee);
    }

    public Employee getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }

    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    public void updateSalary(int id, double salary) {
        employeeDAO.updateSalary(id, salary);
    }

    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }
}
