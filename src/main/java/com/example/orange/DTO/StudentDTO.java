package com.example.orange.DTO;

import com.example.orange.Entities.Course;
import com.example.orange.Entities.Skills;

import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

public class StudentDTO {
    private int StudentID;
    private String FirstName;
    private String LastName;
    private String email;
    private long nationalID;
    private boolean maleGender;
    private String phoneNumber;
    private List<Skills> gainedSkills;
    private List <Course> courses;

    public List<Skills> getGainedSkills() {
        return gainedSkills;
    }

    public void setGainedSkills(List<Skills> gainedSkills) {
        this.gainedSkills = gainedSkills;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNationalID() {
        return nationalID;
    }

    public void setNationalID(long nationalID) {
        this.nationalID = nationalID;
    }

    public boolean isMaleGender() {
        return maleGender;
    }

    public void setMaleGender(boolean maleGender) {
        this.maleGender = maleGender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
