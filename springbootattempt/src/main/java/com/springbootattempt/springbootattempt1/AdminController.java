package com.springbootattempt.springbootattempt1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

    @Controller
    public class AdminController extends UserController {


        @RequestMapping(value="/user/{id}/addBook", method=RequestMethod.POST)
        public void AddBook(@PathVariable Long id, @RequestParam Long bookId, String title, String description) {
            Book newBook = new Book(title, description);
            newBook = bookRepository.save(newBook);

        }

        @RequestMapping(value="/user/{id}/editBook", method=RequestMethod.POST)
        public void editBook(@RequestParam Long bookId, String title, String description) {
            Book newBook = new Book(title, description);
            newBook = bookRepository.save(newBook);

        }

       // public void setTitle(String title) {this.title = title;}
       // public String getDescription() {return description;}
       // public void setDescription(String description) {this.description = description;}

        @RequestMapping(value="/user/{id}/removeBook", method=RequestMethod.POST)
        public void removeBook(@RequestParam Long bookId) {
            bookRepository.deleteById(bookId);

        }

        //TODO: implement- getting a static error
        @RequestMapping(value="/user/{id}/addRoom", method=RequestMethod.POST)
        public void addRoom(String number, String description) {
            Room newRoom = new Room(number, description);
            newRoom = RoomRepository.save(newRoom);
        }

        //TODO: implement
        @RequestMapping(value="/user/{id}/removeRook", method=RequestMethod.POST)
        public void removeRoom(@RequestParam Long roomId) {
            RoomRepository.deleteById(bookId);


        }
    }
