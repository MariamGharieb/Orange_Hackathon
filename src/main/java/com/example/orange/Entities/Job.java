package com.example.orange.Entities;


import com.example.orange.DTO.JobDTO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Job {
    @SequenceGenerator(
            name = "job_sequence",
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
    @ManyToMany (mappedBy = "JobCourse")
    ArrayList<Course> requiredCourses;
    @ManyToMany
    ArrayList <Skills> requiredSkill;

    public Job(JobDTO jobdto) {
    this.JobDescription = jobdto.getJobDescription();
    this.jobName = jobdto.getJobName();
    this.jobID = jobdto.getJobID();
    this.salary = jobdto.getSalary();
    this.organizationName =jobdto.getOrganizationName();
    this.requiredCourses = jobdto.getRequiredCourses();
    }

    public Job() {

    }

    public ArrayList<Skills> getRequiredSkill() {
        return requiredSkill;
    }

    public void setRequiredSkill(ArrayList<Skills> requiredSkill) {
        this.requiredSkill = requiredSkill;
    }
}
