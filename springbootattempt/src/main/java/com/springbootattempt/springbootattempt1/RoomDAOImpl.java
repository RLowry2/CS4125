package com.springbootattempt.springbootattempt1;

import java.util.ArrayList;
import java.util.List;

public class RoomDAOImpl  implements RoomDAO{

    List<Room> rooms;

    public RoomDAOImpl(){
        rooms = new ArrayList<Room>();
    }


    @Override
    public List<Room> getAllRooms() {
       return rooms;
    }

    @Override
    public Room getRoom(int id) {
       return rooms.get(id);
    }

    @Override
    public void updateRoom(Room room) {
       rooms.get(room.getId()).addtoCart(room.getId());
       System.out.println("Room: Room Number " + room.getId() + ", updated in the database");
    }
}
