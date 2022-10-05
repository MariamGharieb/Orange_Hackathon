package com.example.odc.repo;

import com.example.odc.Entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository <Student,Long> {
}
