package com.Demo.RelationMapping.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Demo.RelationMapping.model.Student;
import com.Demo.RelationMapping.repository.BookRepository;
import com.Demo.RelationMapping.repository.StudentRepository;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private BookRepository bookRepository;
	public Student saveStudent(Student student) {
		log.info("Save student "+student.getBook());
		bookRepository.saveAll(student.getBook());
		return studentRepository.save(student);
	}
	public List<Student> getStudent(){
		return studentRepository.findAll();
	}
}
