package com.dw.springcrudjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.springcrudjpa.model.Student;
import com.dw.springcrudjpa.repository.StudentRepo;

@RestController
public class StudentController {

    @Autowired
    StudentRepo studentrepo;

    //전체조회
    @GetMapping("/students")
    public List<Student> callAllStudent() {
        return studentrepo.findAll();
    }

    //추가
    @PostMapping("/student")
    public Student callSaveStudent(@RequestBody Student student) {
        student = studentrepo.save(student);
        return student;
    }

    //상세조회
    @GetMapping("/student/{studentNumber}")
    public Student callStudentByStudentNumber(@PathVariable long studentNumber) {
        return studentrepo.findById(studentNumber).get();
    }

    //수정
    @PatchMapping("/student")
    public Student updateStudent(@RequestBody Student student) {
        student = studentrepo.save(student);
        return student;
    }

    //삭제
    @DeleteMapping("/student/{studentNumber}")
    public Boolean callDeleteStudent(@PathVariable long studentNumber){
        try {
            studentrepo.deleteById(studentNumber);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
