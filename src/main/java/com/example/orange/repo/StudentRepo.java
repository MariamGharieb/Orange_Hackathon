package com.example.orange.repo;

import com.example.orange.Entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student,Long> {
}
