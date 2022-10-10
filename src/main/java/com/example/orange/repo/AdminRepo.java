package com.example.orange.repo;

import com.example.orange.Entities.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepo extends CrudRepository<Admin,Long> {
}
