package com.example;

//import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeService {
	
	@RequestMapping("/")
	public String display() {
		return "callPost";
	}
	
	
	
	@RequestMapping(path = "addEmp",method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute Employee emp,Model m) {
		m.addAttribute("emp1",emp);
		//int b =15/0;
		return "home";
	}
	
//	@ExceptionHandler(Exception.class)
//	public String exceptionHandler() {
//		return "errorPage";
//	}
	

	

}
