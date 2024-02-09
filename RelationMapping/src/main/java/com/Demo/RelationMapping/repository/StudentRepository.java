package com.Demo.RelationMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Demo.RelationMapping.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
