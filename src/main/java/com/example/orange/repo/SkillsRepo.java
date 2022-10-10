package com.example.orange.repo;

import com.example.orange.Entities.Skills;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepo extends CrudRepository<Skills,Long> {
}
