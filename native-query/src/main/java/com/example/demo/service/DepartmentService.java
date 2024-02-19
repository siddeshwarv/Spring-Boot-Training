package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Department;

public interface DepartmentService {
	Department addDepartment(Department dept);
	List<Department> getDepartment();
	Department getDepartmentByName(String name);
}
