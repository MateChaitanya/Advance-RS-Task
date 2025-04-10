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
	
//	@RequestMapping("/sendData")
//	public String sendDataToJsp(Model model) {
//		model.addAttribute("name", 100);
//		
//		return "home";
//	}
//	
//	@RequestMapping("/")
//	public ModelAndView sendDataToJsp2() {
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("home");
//		mv.addObject("name","Pual");
//		return mv;
//	}
	
//	@RequestMapping("/kbc")
//	public void clientToServer(@RequestParam("name") String abc) {
//		System.out.println(abc);
//	}
//	// url= kbc?name=value
	
//	@RequestMapping("/path/{xyz}")
//	public void clientToServer2(@PathVariable("xyz") String abc) {
//		System.out.println(abc);
//	}
//	// url= /path/value
	
	
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
//	
//	public void deleteEmployee(int id) {
//		
//	}
//	
//	public void updateSalary(int id) {
//		
//	}
//	
//	public Employee getEmployee() {
//		return null;
//	}
//	
//	public List<Employee> getAllEmployee(){
//		return null;
//	}
	
	
	// mapping in web.xml bcoz we need to define servlet 
	// we create bean of ViewResolver in xml bcoz spring internally use it when we return views
	
	// send data from java to jsp we use Model class 
}
