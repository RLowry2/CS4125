package com.springbootattempt.springbootattempt1;

import java.util.List;

public interface RoomDAO {

    public List<Book> getAllRooms();
    public Book getRoomId(int bookId);
    public String getRoomName(String name);
    public double getRoomPrice(double price);
    public void AddRoomToCart(String RoomNum, double price);
    public void RemoveRoomToCart(String RoomNum, double price);

}
