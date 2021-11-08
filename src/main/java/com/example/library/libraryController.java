package com.example.library;

import org.springframework.web.bind.annotation.*;

public class libraryController {


    @RestController
    public static class HelloController {

        @GetMapping("/")
        public String index() {
            return "Applicatiopn running";
        }
        @GetMapping("/users")
        public String getUsers() {
            return "user 1";
        }
        @GetMapping("/books")
        public String getBooks() {
            return "Harry Potter";
        }
        @GetMapping("/book")
        public String getBook(@RequestParam(value = "name", defaultValue = "harry potter") String name) {
            return name;
        }
    }
}