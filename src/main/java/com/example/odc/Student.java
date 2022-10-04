package com.example.odc;

import javax.persistence.*;

@Entity
@Table
public class Student {
    @SequenceGenerator(
            name = "student_generator",
            sequenceName = "student_generator",
            allocationSize = 1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE,
            generator = "student_generator"
    )
    @Id
    private int StudentID;
    private String FirstName;
    private String LastName;
    private String email;
    private long  nationalID;
    private boolean maleGender;
    private String phoneNumber;

}
