package com.example.orange.Service;

import com.example.orange.DTO.StudentDTO;
import com.example.orange.Entities.Skills;
import com.example.orange.Entities.Student;
import com.example.orange.repo.CourseRepo;
import com.example.orange.repo.StudentRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class StudentService {

    private StudentRepo srepo;
    private SkillsService skservice;
    private CourseRepo courserepo;

    public ResponseEntity<?> addStudent(StudentDTO sdto){
        Student student = new Student(sdto);
        srepo.save(student);
        return new ResponseEntity<>(student, HttpStatus.ACCEPTED);
    }

    public Student FindStudentByID (long id){
        return srepo.findById(id).get();
    }
    public ResponseEntity <?> ShowAllStudent (){
        List<Student> student= (List<Student>) srepo.findAll();
        return new ResponseEntity<>(student,HttpStatus.ACCEPTED);
    }

    public void SaveStudent (Student st){
        srepo.save(st);
    }
    public ResponseEntity <?> addSkillToStudent(long StudentID, long SkillID){
        Student student = srepo.findById(StudentID).orElse(null);
        Skills sk = skservice.FindById(SkillID);
        if (sk==null || student==null) {
            return new ResponseEntity<>("Please enter a valid Skill ID or valid student ID", HttpStatus.BAD_REQUEST);
        }
        List <Skills> skill = student.getGainedSkills();
        skill.add(sk);
        srepo.save(student);
        return new ResponseEntity<>(student,HttpStatus.ACCEPTED);
    }

    public ResponseEntity<?> deleteSkillTosStudent( long studID, long skillID){
        Student student = srepo.findById(studID).orElse(null);
        Skills sk = skservice.FindById(skillID);
        if (sk==null || student==null) {
            return new ResponseEntity<>("Please enter a valid Skill ID or valid student ID", HttpStatus.BAD_REQUEST);
        }
        List <Skills> skill = student.getGainedSkills();
        skill.remove(sk);
        srepo.save(student);
        return new ResponseEntity<>(student,HttpStatus.ACCEPTED);
    }

}
