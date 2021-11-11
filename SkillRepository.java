package com.springbootattempt.springbootattempt1;
 
import org.springframework.data.repository.CrudRepository;
 
import java.util.*;
 
public interface SkillRepository extends CrudRepository<Skill, Long> {
    public List<Skill> findByLabel(String label);
 
    public Skill findOne(Long skillId);
}

