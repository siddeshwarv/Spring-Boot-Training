package com.vs.courses.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vs.courses.entities.Course;

public interface CourseDao extends JpaRepository<Course,Long> {

}
