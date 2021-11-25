package com.example.springbootproject;

import java.io.IOException;

import com.example.springbootproject.model.Book;
import com.example.springbootproject.model.Cart;
import com.example.springbootproject.model.SignUp;
import com.opencsv.exceptions.CsvException;
import com.example.springbootproject.model.Login;

public class ProjectApplication {
    public static void main(String[] args) throws CsvException, IOException {
        // SignUp.logUser("user5@something.com", "password5");
        // Login.validateLogin("user1@something.com", "password1");
        // Cart.AddToCart("Book Title", "Room 1");
        // Cart.addBook("Book1", "Author1", 4.39);
        // Cart.addRoom("Room1", 5, 4.39);
        // Book.addBook("Book1", "Author1", 1.00);
        Book.removeBook("Book4");
    }
}
