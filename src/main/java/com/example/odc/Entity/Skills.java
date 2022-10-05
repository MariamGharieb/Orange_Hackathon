package com.example.odc.Entity;

import javax.persistence.*;

@Entity (name= "Skills")
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
    private int skillId;
    private String skillName;
    private float skillRate;

}
