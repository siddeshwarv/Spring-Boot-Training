package com.example.demo.service.impl;

import java.util.List;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService{
	private final DepartmentRepository deptRepo;

    DepartmentServiceImpl(DepartmentRepository deptRepo) {
        this.deptRepo = deptRepo;
    }

	@Override
	public Department addDepartment(Department dept) {
		return deptRepo.save(dept);
	}

	@Override
	public List<Department> getDepartment() {
		return deptRepo.findAll();
	}
	
	@Override
	public Department getDepartmentByName(String name) {

		return (Department) deptRepo.findByName(name);
	}

	

}
