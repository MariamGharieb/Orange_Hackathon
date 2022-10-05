package com.example.odc.Entity;

import javax.persistence.*;
import java.util.List;
import java.sql.Time;
import java.util.Date;

@Entity(name = "Course")
@Table
public class Course {
    @Id
    @SequenceGenerator(
            name = "Course_sequence",
            sequenceName = "Course_sequence",
            allocationSize = 1
    )
    @GeneratedValue (
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
    @Column(name="prerequisites",nullable = false)
    private List<Course> prerequisites;

}
