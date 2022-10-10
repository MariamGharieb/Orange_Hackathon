package com.example.orange.DTO;

import com.example.orange.Entities.Course;
import com.example.orange.Entities.Skills;
import com.example.orange.Entities.Student;

import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.sql.Time;
import java.util.Date;
import java.util.List;

public class CourseDTO {
    private Long id;
    private String courseName;
    private String category;
    private String location;
    private boolean passed;
    private Date startDate;
    private Date endDate;
    private Time startTime;
    private Time endTime;

    private List<Course> prerequisites;
    private List <Skills> courseSkills;
    private List <Student> enrolledStudents;
    public List<Course> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(List<Course> prerequisites) {
        this.prerequisites = prerequisites;
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

    public List<Skills> getCourseSkills() {
        return courseSkills;
    }

    public void setCourseSkills(List<Skills> courseSkills) {
        this.courseSkills = courseSkills;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}
