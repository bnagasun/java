package com.cap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.entities.Employee;
import com.cap.service.EmployeeService;



@RestController
@RequestMapping("/Bank")
public class RestControllerUi {
	@Autowired
	EmployeeService service;
	
	@PostMapping("/createaccount")
	public List<Employee> createAccount(@RequestBody Employee emp){//@PathVariable
		return service.createEmployee(emp);
	}
	
//	@GetMapping("/")
	

}
