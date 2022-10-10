package com.example.orange.Service;

import com.example.orange.DTO.JobDTO;
import com.example.orange.Entities.Job;
import com.example.orange.Entities.Skills;
import com.example.orange.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class JobService {

    @Autowired
    private JobRepo jrepo;
    @Autowired
    private SkillsService skillservice;

    public ResponseEntity<?> addJob(JobDTO jobdto){
        Job job= new Job(jobdto);
        jrepo.save(job);
        return new ResponseEntity<>(job, HttpStatus.ACCEPTED);
    }
    public ResponseEntity<?> showAllJobs() {
        List<Job> jobs = (List<Job>) jrepo.findAll();
        return new ResponseEntity<>(jobs,HttpStatus.ACCEPTED);
    }

    public Job findJobById(Long jobId) {
        return jrepo.findById(jobId).orElse(null);
    }

    public ResponseEntity<?> addSkillToJob(Long jobId, Long skillId) {
        Job job = jrepo.findById(jobId).orElse(null);
        if(job == null){
            return new ResponseEntity<>("Invalid job ID",HttpStatus.BAD_REQUEST);
        }
        Skills skill = skillservice.findSkillById(skillId);
        if(skill == null){
            return new ResponseEntity<>("Invalid skill ID",HttpStatus.BAD_REQUEST);
        }
        ArrayList<Skills> skills= job.getRequiredSkill();
        skills.add(skill);
        job.setRequiredSkill(skills);
        jrepo.save(job);
        return new ResponseEntity<>(job,HttpStatus.ACCEPTED);
    }
}
