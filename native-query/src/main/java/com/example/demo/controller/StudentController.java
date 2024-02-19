package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents() ;
    }

    @GetMapping("/byname")
    public List<Student> getStudentByName(@RequestParam String name) {
        return studentService.getStudentByName(name);
    }

    @GetMapping("/bydepartment")
    public List<Student> getStudentByDepartment(@RequestParam String departmentName) {
        return studentService.getStudentByDepartment(departmentName);
    }
}