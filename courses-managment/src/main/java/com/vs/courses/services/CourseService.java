package com.vs.courses.services;

import java.util.List;

import com.vs.courses.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long l);

	public Course addCourse(Course course);
	
	public Course updateCourse(Course  course);
	
	public long deleteCourse(long courseId);

	public Course getCourse(String courseId, String title);
}
