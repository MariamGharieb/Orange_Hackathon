package com.example.orange.DTO;

import com.example.orange.Entities.Course;

import javax.persistence.ManyToMany;
import java.util.ArrayList;

public class JobDTO {
    private int jobID;
    private String jobName;
    private String organizationName;
    private String JobDescription;
    private float salary;

    public ArrayList<Course> getRequiredCourses() {
        return requiredCourses;
    }

    public void setRequiredCourses(ArrayList<Course> requiredCourses) {
        this.requiredCourses = requiredCourses;
    }

    @ManyToMany
    ArrayList<Course> requiredCourses;

    public int getJobID() {
        return jobID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getJobDescription() {
        return JobDescription;
    }

    public void setJobDescription(String jobDescription) {
        JobDescription = jobDescription;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
