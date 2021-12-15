package com.example.liz_rebuild.model;

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

    public Admin(long id, String firstName, String lastName, String email, ArrayList<Book> books) {
        super();
        this.id = id;
        userType = "admin"; //default type
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.rentedBooks = books;
    }

    //----------------------------------------actual functionality------------------------------------------------------

    /*public void saveToCart(String title, String bookDescription, double bookPrice,
                           String number, int size, double roomPrice) throws IOException {
        Transaction.addBook(title, bookDescription, bookPrice);
        Transaction.addRoom(number, size, roomPrice);
    }*/
    public void addRoom(String roomID, int roomQuantity, boolean roomAvailability) {
        book.addRoom(roomID, roomQuantity, roomAvailability);
    }

    public void removeRoom(String room){
    Room.removeRoom(room);
    }

    public void addBook(String title, String author, double price);
        Book.addBook(title, author, price);
    }

    public void removeBook(String book){
         Book.removeBook(book)
    }

    public void addBookFromRepo(){}

    public void removeBookFromRepo(){}

    public void addRoomFromRepo(){}

    public void removeRoomFromRepo(){}
}



