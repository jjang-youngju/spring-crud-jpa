package com.dw.springcrudjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dw.springcrudjpa.model.Course;
import com.dw.springcrudjpa.repository.CourseRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class CourseController {
    
    @Autowired
    CourseRepo courserepo;

    //전체조회
    @GetMapping("/courses")
    public List<Course> callAllCourse() {
        return courserepo.findAll();
    }

    //추가
    @PostMapping("/course")
    public Course callSaveCourse(@RequestBody Course course) {
        course = courserepo.save(course);
        return course;
    }

    //상세조회
    @GetMapping("/course/{courseNumber}")
    public Course callCourseByCourseNumber(@PathVariable long courseNumber) {
        return courserepo.findById(courseNumber).get();
    }

    //수정
    @PatchMapping("/course")
    public Course updateCourse(@RequestBody Course course) {
        course = courserepo.save(course);
        return course;
    }

    //삭제
    @DeleteMapping("/course/{courseNumber}")
    public Boolean callDeleteCourse(@PathVariable long courseNumber) {
        try {
            courserepo.deleteById(courseNumber);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
