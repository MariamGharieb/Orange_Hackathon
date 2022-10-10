package com.example.orange.Service;

import com.example.orange.DTO.CourseDTO;
import com.example.orange.Entities.Course;
import com.example.orange.Entities.Skills;
import com.example.orange.repo.CourseRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


public class CourseService {
    private CourseRepo courserepo;
    private SkillsService skillservice;




    public ResponseEntity<?> showAllCourses() {
        return new ResponseEntity<>(courserepo.findAll(),HttpStatus.ACCEPTED);
    }

    public ResponseEntity<?> addSkillToCourse(Long courseId,Long skillId) {
        Course course = courserepo.findById(courseId).orElse(null);
        Skills skill = skillservice.findSkillById(skillId);
        if(skill == null||course == null){
            return new ResponseEntity<>("Invalid skill ID or Invalid CourseID",HttpStatus.BAD_REQUEST);
        }
        List<Skills> skills= course.getCourseSkills();
        skills.add(skill);
        course.setCourseSkills((ArrayList<Skills>) skills);
        courserepo.save(course);
        return new ResponseEntity<>(course,HttpStatus.ACCEPTED);
    }
    public ResponseEntity<?> delSkillToCourse(Long courseId, Long skillId) {
        Course course = courserepo.findById(courseId).orElse(null);
        Skills skill = skillservice.findSkillById(skillId);
        if(skill == null||course == null){
            return new ResponseEntity<>("Invalid skill ID or Invalid CourseID",HttpStatus.BAD_REQUEST);
        }
        ArrayList<Skills> skills= course.getCourseSkills();
        skills.remove(skill);
        course.setCourseSkills(skills);
        courserepo.save(course);
        return new ResponseEntity<>(course,HttpStatus.ACCEPTED);
    }

    public ResponseEntity<?> addCourse(CourseDTO courseDTO) {
        Course course = new Course(courseDTO);
        courserepo.save(course);
        return new ResponseEntity<>(course, HttpStatus.ACCEPTED);
    }


}
