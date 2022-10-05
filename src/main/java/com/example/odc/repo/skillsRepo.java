package com.example.odc.repo;

import com.example.odc.Entity.Skills;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface skillsRepo extends CrudRepository<Skills,Long> {
}
