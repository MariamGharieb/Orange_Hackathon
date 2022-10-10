package com.example.orange.Entities;


import com.example.orange.DTO.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data

@ToString
@Entity
@Table
public class Student {
    @SequenceGenerator(
            name = "student_generator",
            sequenceName = "student_generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_generator"
    )
    @Id
    private long StudentID;
    private String FirstName;
    private String LastName;
    private String email;
    private long nationalID;
    private boolean maleGender;
    private String phoneNumber;
    @ManyToMany
     List<Skills> gainedSkills;
    @ManyToMany (mappedBy = "studentCourses")
     List <Course> courses;

    public Student(StudentDTO studentdto) {
        this.email = studentdto.getEmail();
        this.FirstName = studentdto.getFirstName();
        this.LastName = studentdto.getLastName();
        this.maleGender =studentdto.isMaleGender();
        this.StudentID = studentdto.getStudentID();
        this.phoneNumber = studentdto.getPhoneNumber();
        this.nationalID = studentdto.getNationalID();
        this.gainedSkills = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public Student() {

    }
}

