package com.springbootattempt.springbootattempt1;

import java.util.ArrayList;
import java.util.List;

public class BookDAOImpl implements BookDAO {
    
    List<Book> books;

    public BookDAOImpl(){
        books = new ArrayList<Book>();
    }


    @Override
    public List<Book> getAllBooks() {
       return books;
    }

    @Override
    public Book getBook(int id) {
       return books.get(id);
    }

    @Override
    public void updateBook(Book book) {
       books.get(book.getId()).addtoCart(book.getTitle());
       System.out.println("Student: Roll No " + book.getId() + ", updated in the database");
    }
}
