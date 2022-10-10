package com.example.orange.Entities;

import com.example.orange.DTO.CourseDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Time;
import java.util.*;

@Entity
@Table
public class Course {
    @Id
    @SequenceGenerator(
            name = "Course_sequence",
            sequenceName = "Course_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Course_sequence"
    )
    private Long id;
    private String courseName;
    private String category;
    private String location;
    private boolean passed;
    private Date startDate;
    private Date endDate;
    private Time startTime;
    private Time endTime;
    @OneToMany
    private ArrayList<Course> prerequisites;
    @JsonIgnore
    @ManyToMany
    private ArrayList <Skills> courseSkills;
    @ManyToMany (mappedBy = "JobCourse")
    ArrayList<Course> requiredCourses;
    @ManyToMany (mappedBy = "studentCourses")
    private ArrayList < Student> enrolledStudents;

    public Course(CourseDTO coursedto) {
        this.category = coursedto.getCategory();
        this.courseName = coursedto.getCourseName();
        this.id = coursedto.getId();
        this.startDate = coursedto.getStartDate();
        this.endDate = coursedto.getEndDate();
        this.endTime = coursedto.getEndTime();
        this.startTime = coursedto.getStartTime();
        this.location = coursedto.getLocation();
        this.passed = coursedto.isPassed();
        this.prerequisites = new ArrayList<>();
        this.courseSkills = new ArrayList<>();
        this.enrolledStudents = new ArrayList<>();
        this.requiredCourses =new ArrayList<>();
    }
    public Course() {


    }

    public ArrayList<Skills> getCourseSkills() {
        return courseSkills;
    }

    public void setCourseSkills(ArrayList<Skills> courseSkills) {
        this.courseSkills = courseSkills;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public ArrayList<Course> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(ArrayList<Course> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public ArrayList<Course> getRequiredCourses() {
        return requiredCourses;
    }

    public void setRequiredCourses(ArrayList<Course> requiredCourses) {
        this.requiredCourses = requiredCourses;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}

