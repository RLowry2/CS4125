package com.example.springbootproject.repository;
 
import java.util.List;
 
import org.springframework.data.repository.CrudRepository;
 
public interface UserRepository extends CrudRepository<User, Long> {
 
    Object findOne(Long id);
 
    void save(List<User> users);
 
}
 

