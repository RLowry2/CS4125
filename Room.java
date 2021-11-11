package com.springbootattempt.springbootattempt1;
 
import javax.persistence.*;
 
@Entity
public class Room {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String number;
    private String description;
   
    public Room() {
        super();
    }
 
    public Room(String number, String description) {
        super();
        this.number = number;
        this.description = description;
    }
 
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getNumber() {
        return number;
    }
 
    public void setNumber(String number) {
        this.number = number;
    }
 
    public String getDescription() {
        return description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }
}
 

