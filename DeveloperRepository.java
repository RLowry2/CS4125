package com.springbootattempt.springbootattempt1;
 
import java.util.List;
 
import org.springframework.data.repository.CrudRepository;
 
public interface DeveloperRepository extends CrudRepository<Developer, Long> {
 
    Object findOne(Long id);
 
    void save(List<Developer> developers);
 
}
 

