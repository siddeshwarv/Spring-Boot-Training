package com.vs.siddeshwar.service;

import java.util.List;

import com.vs.siddeshwar.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee deleteEmployee(Employee emp);
	Employee updateEmployee(Employee emp);
	Employee getById(long id);
}

