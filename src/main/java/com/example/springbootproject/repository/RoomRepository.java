package com.example.springbootproject.repository;

import com.example.springbootproject.model.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {
    public Room findOne(Long roomId);
}
