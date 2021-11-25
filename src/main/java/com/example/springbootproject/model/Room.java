package com.example.springbootproject.model;
 
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.persistence.*;
 
@Entity
public class Room {
    // @Id
    // @GeneratedValue(strategy=GenerationType.AUTO)
    // private long id;
    // private String number;
    // private String description;
   
    // public Room() {
    //     super();
    // }
 
    // public Room(String number, String description) {
    //     super();
    //     this.number = number;
    //     this.description = description;
    // }
 
    // public long getId() {
    //     return id;
    // }
 
    // public String getNumber() {
    //     return number;
    // }
 
    // public String getDescription() {
    //     return description;
    // }

    public static void addRoom(String number, int size, double price) throws IOException {
      try (FileWriter writer = new FileWriter("room.csv", true)) {

      StringBuilder sb = new StringBuilder();
      sb.append(number);
      sb.append(',');
      sb.append(size);
      sb.append(',');
      sb.append(price);
      sb.append('\n');

      writer.write(sb.toString());

      } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
      }
    }

    public static void remove 
}
 