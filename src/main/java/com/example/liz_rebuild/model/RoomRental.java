package com.example.liz_rebuild.model;

import javax.persistence.*;


@Entity
public class RoomRental {
    @Id
    private long id;
    private long availability;
    

    public RoomRental() {
        super();
    }

    public long setID() {
        return id;
    }

    public long setAvailablity() {
        return availability;
    }

 }
