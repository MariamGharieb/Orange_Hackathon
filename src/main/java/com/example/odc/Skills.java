package com.example.odc;

import javax.persistence.*;

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
    private int skillId;
    private String skillName;
    private float skillRate;

}
