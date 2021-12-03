package com.springbootattempt.springbootattempt1;

import java.util.List;

public interface CartService{
    List<Book> findAllBooks(String bookId);
    List<Room> findAllRooms();
}