package com.dw.springcrudjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.springcrudjpa.model.Course;

public interface CourseRepo extends JpaRepository<Course,Long> {
    
}
