package com.dw.springcrudjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="course")
public class Course {
    
    @Id
    @Column
    private long courseNumber;
    @Column
    private String courseName;
    @Column
    private String courseRoom;
    @Column
    private String courseStart;
    @Column
    private String courseEnd;
    @Column
    private String courseTeacher;
    
}
