package com.springbootattempt.springbootattempt1;

import java.util.List;

public interface Dao<T>{



    public List<Room> getAllrooms();
    public Room getRoom(int roomId);
    public void updateRoom(Room room);

}