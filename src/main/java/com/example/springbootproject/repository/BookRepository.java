package com.example.springbootproject.repository;
 
import org.springframework.data.repository.CrudRepository;
 
import java.util.*;
 
public interface BookRepository extends CrudRepository<Book, Long> {
    public List<Book> findByLabel(String title);
 
    public Book findOne(Long bookId);
}

