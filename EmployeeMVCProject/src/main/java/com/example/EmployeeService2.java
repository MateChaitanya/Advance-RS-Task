package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class EmployeeService2 {

   @RequestMapping("/errorFunc")
   public String errorFunction() {
       int r = 10 / 0;  
       return "home";
   }

   // Exception handler method
   @ExceptionHandler(ArithmeticException.class)
   public String handleArithmeticException(ArithmeticException ex, Model model) {
       model.addAttribute("errorMessage", "An arithmetic error occurred: " + ex.getMessage());
       return "errorPage"; 
   }
}
