package com.vs.siddeshwar.service.impl;

import org.springframework.stereotype.Service;

import com.vs.siddeshwar.model.Employee;
import com.vs.siddeshwar.repository.EmployeeRepository;
import com.vs.siddeshwar.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepository employeeRepository;
	
	public  EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}
	
}
