package com.springbootattempt.springbootattempt1;
 
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
public class SpringbootattemptApplication implements CommandLineRunner {
 
    @Autowired
    UserRepository userRepository;
 
    @Autowired
    BookRepository bookRepository;
 
    public static void main(String[] args) {
        SpringApplication.run(SpringbootattemptApplication.class, args);
    }
 
    @Override
    public void run(String... args) throws Exception {
        Book javascript = new Book("javascript", "Javascript language skill");
        Book ruby = new Book("ruby", "Ruby language skill");
        Book emberjs = new Book("emberjs", "Emberjs framework");
        Book angularjs = new Book("angularjs", "Angularjs framework");
 
        bookRepository.save(javascript);
        bookRepository.save(ruby);
        bookRepository.save(emberjs);
        bookRepository.save(angularjs);
 
        List<User> users = new LinkedList<User>();
        users.add(new User("John", "Smith", "john.smith@example.com",
                Arrays.asList(new Book[] { javascript, ruby })));
        users.add(new User("Mark", "Johnson", "mjohnson@example.com",
                Arrays.asList(new Book[] { emberjs, ruby })));
        users.add(new User("Michael", "Williams", "michael.williams@example.com",
                Arrays.asList(new Book[] { angularjs, ruby })));
        users.add(new User("Fred", "Miller", "f.miller@example.com",
                Arrays.asList(new Book[] { emberjs, angularjs, javascript })));
        users.add(new User("Bob", "Brown", "brown@example.com",
                Arrays.asList(new Book[] { emberjs })));
        userRepository.save(users);
    }
}
 

