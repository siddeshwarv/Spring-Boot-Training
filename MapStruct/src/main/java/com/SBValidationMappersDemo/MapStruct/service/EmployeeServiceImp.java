package com.SBValidationMappersDemo.MapStruct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SBValidationMappersDemo.MapStruct.dto.EmployeeDto;
import com.SBValidationMappersDemo.MapStruct.entity.Employee;
import com.SBValidationMappersDemo.MapStruct.mapper.EmployeePopulator;
import com.SBValidationMappersDemo.MapStruct.repository.EmployeeRepo;
@Service	
public class EmployeeServiceImp implements EmployeeService{
	@Autowired
	EmployeeRepo employeeRepo;
	public EmployeeDto  saveEmployee(EmployeeDto employeeDto) {
//		return employeeRepo.save(employee);
		Employee employee = EmployeePopulator.INSTANCE.populateEmployee(employeeDto);
		return employeeDto;
	}
	
	
}
