package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Student;

public interface StudentService {
	Student addStudent(Student student);
	List<Student> getStudents();
	List<Student> getStudentByName(String name);
	List<Student> getStudentByDepartment(String name);
}
