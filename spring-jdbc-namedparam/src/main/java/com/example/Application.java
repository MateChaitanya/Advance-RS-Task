package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService employeeService = context.getBean(EmployeeService.class);

        Employee emp = new Employee(1, "Ganesh", "Finance", 50000);
        employeeService.addEmployee(emp);

        System.out.println("All Employees: " + employeeService.getAllEmployees());
        System.out.println("Employee with ID 2: " + employeeService.getEmployeeById(2));
    }
}
