package com.example.orange.Service;

import com.example.orange.DTO.SkillsDTO;
import com.example.orange.Entities.Skills;
import com.example.orange.repo.SkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsService {
    @Autowired
    private SkillsRepo skillrepo;

    public Skills findSkillById(Long skillId) {
        return skillrepo.findById(skillId).orElse(null);
    }

    public ResponseEntity<?> addSkill(SkillsDTO skillDTO) {
        Skills skill=new Skills(skillDTO);
        skillrepo.save(skill);
        return new ResponseEntity<>(skill, HttpStatus.ACCEPTED);
    }

    public ResponseEntity<?> ShowSkills (){
        List<Skills>skill = (List<Skills>) skillrepo.findAll();
        return new ResponseEntity<>(skill,HttpStatus.ACCEPTED);
    }

    public Skills FindById(long skillid){
    return skillrepo.findById(skillid).orElse(null);
    }
}
