package com.SBValidationMappersDemo.MapStruct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SBValidationMappersDemo.MapStruct.dto.EmployeeDto;
import com.SBValidationMappersDemo.MapStruct.entity.Employee;
import com.SBValidationMappersDemo.MapStruct.service.EmployeeServiceImp;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeServiceImp	 employeeServiceImp;
	
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeServiceImp.saveEmployee(employee),HttpStatus.CREATED);
	}
	
}
