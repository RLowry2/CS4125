package com.example.liz_rebuild.model;

import javax.persistence.*;

@Entity
public class BorrowBook {
    @Id
    private long id;
    private String title;
    private String author;
    private long availability;
    

    public BorrowBook() {
        super();
    }

    //TODO: should take bookId
    public BorrowBook(String title, String author) {
        super();
        this.title = title;
        this.author = author;
    }

    public long setID() {
        return id;
    }

    public void addTitle(String title) {

    }

    public void addAuthor(String author) {

    }

    public long setAvailablity() {
        return availability;
    }

 }
