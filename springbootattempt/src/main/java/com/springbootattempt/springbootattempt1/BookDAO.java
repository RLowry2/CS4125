package com.springbootattempt.springbootattempt1;

import java.util.List;

public interface BookDAO {

    public List<Book> getAllBooks();
    public Book getBook(int bookId);
    public void updateBook(Book book);

}
