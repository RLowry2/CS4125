package com.example.springbootproject.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


//inherited from user: has special abilities like reserving rooms ahead of time(in cart) and
// adding/removing/editing rooms and books in controller

@Entity
public class AdminUser extends User {

    // public AdminUser(String firstName, String lastName, String userType, String email, List<Book> books) {
    //     super(firstName, lastName, userType, email, books);
    //     super().setUserType(userT)
    // }

    public AdminUser() {
         super();
    }

    public void addBook(long id, String title, String description ){
    }

    public void removeBook(){
    }

    public void editBook(){
    }

    public void addRoom(){
    }

    public void removeRoom(){
    }

    public void editRoom(){

    }
}


