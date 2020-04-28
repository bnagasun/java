package com.cap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.EmployeeDao;
import com.cap.entities.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao empdao;

	@Override
	public List<Employee> createEmployee(Employee emp) {
		empdao.save(emp);
		return empdao.findAll();
	}
	

}
