package com.example.odc.Entity;

import com.example.odc.Entity.Course;

import javax.persistence.*;
import java.util.ArrayList;

@Entity (name= "Job")
@Table
public class Job {
    @SequenceGenerator(
            name="job_sequence",
            sequenceName = "job_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "job_sequence"
    )
    @Id
    private int jobID;
    private String jobName;
    private String organizationName;
    private String JobDescription;
    private float salary;
    @ManyToMany
    ArrayList <Course> requiredCourses;

}
