package com.example.orange.repo;

import com.example.orange.Entities.Course;
import com.example.orange.Entities.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CourseRepo extends CrudRepository<Course,Long> {

}
