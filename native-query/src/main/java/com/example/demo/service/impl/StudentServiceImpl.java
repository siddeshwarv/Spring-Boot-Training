package com.example.demo.service.impl;

import java.util.List;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

public class StudentServiceImpl implements StudentService{
	private final StudentRepository studentRepository;

    StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    @Override
	public List<Student> getStudentByName(String name) {

		return (List<Student>) studentRepository.findByName(name);
	}
    
    @Override
	public List<Student> getStudentByDepartment(String name) {

		return (List<Student>) studentRepository.findByCourse(name);
	}

    
    @Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}
}
