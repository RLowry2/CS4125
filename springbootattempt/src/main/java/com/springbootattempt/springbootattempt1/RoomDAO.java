package com.springbootattempt.springbootattempt1;

import java.util.List;

public interface RoomDAO {

    public List<Room> getAllRooms();
    public Room getRoom(int roomId);
    public void updateRoom(Room room);
}
