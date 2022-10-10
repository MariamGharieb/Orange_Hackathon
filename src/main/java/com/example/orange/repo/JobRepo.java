package com.example.orange.repo;

import com.example.orange.Entities.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepo extends CrudRepository<Job,Long> {
}
