package com.example.liz_rebuild;

import com.example.liz_rebuild.model.Book;
import com.example.liz_rebuild.model.User;
import com.example.liz_rebuild.repository.BookRepository;
import com.example.liz_rebuild.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
public class LizRebuildApplication {
    @Autowired
    static UserRepository userRepository;

    @Autowired
    static BookRepository bookRepository;

    public static void main(String[] args) {
        LizRebuildApplication.run();
        SpringApplication.run(LizRebuildApplication.class, args);
    }
    public static void run(String... args) {
        Book javascript = new Book("javascript", "Javascript language skill");
        Book ruby = new Book("ruby", "Ruby language skill");
        Book emberjs = new Book("emberjs", "Emberjs framework");
        Book angularjs = new Book("angularjs", "Angularjs framework");

        bookRepository.save(javascript);
        bookRepository.save(ruby);
        bookRepository.save(emberjs);
        bookRepository.save(angularjs);

        List<User> users = new LinkedList<User>();
        users.add(new User());
    }

}
