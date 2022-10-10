package com.example.orange.Entities;


import com.example.orange.DTO.SkillsDTO;
import com.example.orange.DTO.StudentDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table
public class Skills {
    @Id
    @SequenceGenerator(
            name = "Skills_generator",
            sequenceName = "Skills_generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Skills_generator"
    )
    private long skillId;
    private String skillName;
    private float skillRate;
    @JsonIgnore
    @ManyToMany (mappedBy = "gainedSkills")
    ArrayList <Student> studentSkills;
    @JsonIgnore
    @ManyToMany (mappedBy = "requiredSkill")
    ArrayList <Job> JobSKill;
    public Skills(SkillsDTO skillsdto) {
        this.skillId=skillsdto.getSkillId();
        this.skillName =skillsdto.getSkillName();
        this.skillRate = skillsdto.getSkillRate();
        this.JobSKill = new ArrayList<>();
        this.studentSkills = new ArrayList<>();
    }

    public Skills() {

    }
}
