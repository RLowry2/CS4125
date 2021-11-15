package com.springbootattempt.springbootattempt1;

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
