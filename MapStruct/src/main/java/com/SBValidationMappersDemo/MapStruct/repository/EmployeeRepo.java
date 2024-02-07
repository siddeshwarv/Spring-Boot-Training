package com.SBValidationMappersDemo.MapStruct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SBValidationMappersDemo.MapStruct.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
	
}
