package com.springbootattempt.springbootattempt1;

import java.util.List;

public interface CartService{
    List<Cart> findAllCarts()
    List<Book> findAllBooks(String bookId);
    List<Room> findAllRooms();
}