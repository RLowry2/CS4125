package com.springbootattempt.springbootattempt1;
 
import java.util.List;
 
import org.springframework.data.repository.CrudRepository;
 
public interface UserRepository extends CrudRepository<User, Long> {
 
    Object User findOne(Long id);
 
    void save(List<User> users);
 
}
 

