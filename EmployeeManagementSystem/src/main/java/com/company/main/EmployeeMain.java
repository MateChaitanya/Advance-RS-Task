package com.company.main;

import com.company.model.Employee;
import com.company.service.EmployeeService;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();

        service.addEmployee(new Employee(1, "John", "IT", 50000));
        service.addEmployee(new Employee(2, "Jane", "HR", 60000));
        
        List<Employee> employees = service.getAllEmployees();
        System.out.println("Employees: " + employees);
        
        service.updateSalary(1, 70000);
        service.deleteEmployee(2);
        System.out.println("Employees: " + employees);
    }
}
