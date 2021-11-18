package com.example.liz_rebuild.repository;
 
import java.util.List;

import com.example.liz_rebuild.model.User;
import org.springframework.data.repository.CrudRepository;
 
public interface UserRepository extends CrudRepository<User, Long> {
 
    Object findOne(Long id);
 
    void save(List<User> users);
 
}
 

