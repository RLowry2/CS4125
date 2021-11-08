package com.example.library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class libraryController {


    @RestController
    public static class HelloController {

        @GetMapping("/")
        public String index() {
            return "user 1";
        }

    }
}