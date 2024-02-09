package com.Demo.RelationMapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Demo.RelationMapping.model.Student;
import com.Demo.RelationMapping.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/student")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		return ResponseEntity.ok(studentService.saveStudent(student) );
	}
	
	@GetMapping("/student")
	public  ResponseEntity<List<Student>> getStudent(){
		return ResponseEntity.ok(studentService.getStudent());
	}
}
