package com.vs.siddeshwar.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vs.siddeshwar.model.Employee;
import com.vs.siddeshwar.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping()
	public List<Employee> getEmployees(){
		return employeeService.getAllEmployee();
	}
	@GetMapping("/{id}")
	public Employee getById(@PathVariable("id") long empolyeeId) {
		return employeeService.getById(empolyeeId);
	}
	
	
	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		log.info("This is controller saveEmployee "+employee.getFirstName()+" "+employee.getId()+" "+employee.getLastName()+" "+employee.getEmail());
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
		
	}
}
