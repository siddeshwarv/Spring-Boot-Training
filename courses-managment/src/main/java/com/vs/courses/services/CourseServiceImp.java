package com.vs.courses.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vs.courses.dao.CourseDao;
import com.vs.courses.entities.Course;

@Service
public class CourseServiceImp implements CourseService {
	@Autowired
	private CourseDao courseDao;
//	List<Course> list;
	public CourseServiceImp() {
//		list = new ArrayList<>();
//		list.add(new Course(123,"Java","This is Standard Java."));
//		list.add(new Course(124,"Java Enterprise","This is Java Standard Enterprise."));
		
	}
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
//		Course c = null;
//		for(Course course:list) {
//			if (course.getId()==courseId) {
//				c = course;
//				break;
//			}
//		}
		return courseDao.findById(courseId).get();
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e-> {
//			if (e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}

	@Override
	public long deleteCourse(long courseId) {
//		list.forEach(e->{
//			if(e.getId()==courseId) {
//				list.remove(e);
//			}
//		});
		courseDao.deleteById(courseId);
		return courseId;
	}

	@Override
	public Course getCourse(String courseId, String title) {
//		System.out.println(courseId+ " "+title);
//		for (int i = 0; i < list.size(); i++) {
//			
//			if(String.valueOf(list.get(i).getId()).equals(courseId)|| list.get(i).getTitle().equals(title)) {
//						
//				return list.get(i);
//			}	
//		}
		
		return null;
 	}

	
}
