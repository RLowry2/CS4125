package com.springbootattempt.springbootattempt1;

import java.util.List;

public interface BookDAO {

    public List<Book> getAllBooks();
    public Book getBookId(int bookId);
    public String getBookTitle(String name);
    public double getBookPrice(double price);
    public void AddBookToCart(String title, String author, double price);

}
