package com.vs.courses.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vs.courses.entities.Course;

@Service
public class CourseServiceImp implements CourseService {
	
	List<Course> list;
	public CourseServiceImp() {
		list = new ArrayList<>();
		list.add(new Course(123,"Java","This is Standard Java."));
		list.add(new Course(124,"Java Enterprise","This is Java Standard Enterprise."));
		
	}
	
	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for(Course course:list) {
			if (course.getId()==courseId) {
				c = course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		list.forEach(e-> {
			if (e.getId()==course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
		return course;
	}

	@Override
	public long deleteCourse(long courseId) {
		list.forEach(e->{
			if(e.getId()==courseId) {
				list.remove(e);
			}
		});
		return courseId;
	}

	
}
