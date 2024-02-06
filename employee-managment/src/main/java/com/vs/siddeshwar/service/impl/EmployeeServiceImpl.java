package com.vs.siddeshwar.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vs.siddeshwar.exception.ResourceNotFoundException;
import com.vs.siddeshwar.model.Employee;
import com.vs.siddeshwar.repository.EmployeeRepository;
import com.vs.siddeshwar.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	private static final Logger log = LoggerFactory.getLogger(Employee.class);
	@Autowired
	private EmployeeRepository employeeRepository;
	public  EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		log.info("Entered saveEmployee function details of employee are"+employee.getEmail()+" "+employee.getFirstName()+" "+employee.getLastName()+" .");
		return employeeRepository.save(employee);
	}
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}
	@Override
	public Employee deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		 employeeRepository.delete(emp);
		 return emp;
	}
	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employeeRepository.save(emp);
	}
	@Override
	public Employee getById(long id) {
		// TODO Auto-generated method stub
		Optional<Employee> emp = employeeRepository.findById(id);
		if(emp.isPresent()) {
			return emp.get();
		}else {
			throw new ResourceNotFoundException("Employee","Id",id);
			
		}
	}
	
	
}
