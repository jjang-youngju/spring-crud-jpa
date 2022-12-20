package com.dw.springcrudjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="student")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long studentNumber;
    @Column
    private String studentName;
    @Column
    private int studentAge;
    @Column
    private String studentPhone;
    @Column
    private String address;

    @ManyToOne
    @JoinColumn(name="course_number")
    private Course course;

}
