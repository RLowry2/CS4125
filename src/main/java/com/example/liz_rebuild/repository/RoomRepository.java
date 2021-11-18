package com.example.liz_rebuild.repository;

import com.example.liz_rebuild.model.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {
    public Room findOne(Long roomId);
}
