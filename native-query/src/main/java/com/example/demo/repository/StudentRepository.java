package com.example.demo.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	@Query(value = "SELECT * FROM students WHERE course = :course", nativeQuery = true)
    Collection<Student> findByCourse(String course);
	
	@Query(value = "SELECT * FROM students WHERE name = :name", nativeQuery = true)
    Collection<Student> findByName(String name);
}
