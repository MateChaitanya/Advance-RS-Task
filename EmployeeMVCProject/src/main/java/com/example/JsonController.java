package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class JsonController {

    @RequestMapping("/api")
    public String jsonFormat() {
        return "Chaitanya";
    }

//    @RequestMapping("/Object")
//    public Employee jsonFormatObject() {
//        return new Employee(10, "Chaitanya", "CS", 60000);
//    }
    
    @RequestMapping("/Object")
    public ResponseEntity<Employee> jsonFormatObject() {
        Employee emp =new Employee(10, "Chaitanya", "CS", 60000);
        return new ResponseEntity<Employee>(emp,HttpStatus.FORBIDDEN);
    }

    @RequestMapping("/customResponse")
    public ResponseEntity<MyResponseEntity<Employee>> customResponse() {
        Employee emp = new Employee(11, "Mate Chaitanya", "IT", 75000);
        MyResponseEntity<Employee> customResponse = new MyResponseEntity<>(emp, HttpStatus.OK);
        return new ResponseEntity<>(customResponse, HttpStatus.OK);
    }
}
