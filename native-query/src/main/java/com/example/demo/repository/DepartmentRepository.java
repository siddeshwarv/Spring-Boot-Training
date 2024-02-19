package com.example.demo.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
	
	@Query(value = "SELECT * FROM departments WHERE name = :name", nativeQuery = true)
    Collection<Department> findByName(String name);
	
}
