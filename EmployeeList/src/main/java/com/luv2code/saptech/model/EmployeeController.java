package com.luv2code.saptech.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	//load employee data
	private List<Employee> theEmployees;
	
	@PostConstruct
	private void loadData() {
		Employee emp1 = new Employee(1,"Pala", "Veera", "vrpl@yahoo.com");
		Employee emp2 = new Employee(1,"Anu", "Anandhi", "vrpl1@yahoo.com");
		Employee emp3 = new Employee(1,"Anandhi", "Anandavalli", "vrpl2@yahoo.com");
		
		Employee emp4 = new Employee(1,"Kasthuri", "Swetha", "vrpl3@yahoo.com");
		//create the list
		theEmployees = new ArrayList<>();
		
		// add to the list
		theEmployees.add(emp1);
		theEmployees.add(emp2);
		theEmployees.add(emp3);
		theEmployees.add(emp4);
		
	}
	/// add mapping for list
	@GetMapping("/list")
	public String listEmp(Model theModel) {
	
	theModel.addAttribute("employees", theEmployees);
	
	return "list-employees";
}
}