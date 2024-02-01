package com.effigo.siddeshwar.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Course : id, name , author

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1,"Learnjava","Siddeshwar"),
				new Course(2,"LearnSpring","Vasam"),
				new Course(3,"LearnSinging","Yoto")
				);
	}
}
