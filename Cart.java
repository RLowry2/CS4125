package com.springbootattempt.springbootattempt1;
 
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import javax.persistence.*;
 
@Entity
public class Cart extends User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long bookId;
    private String title;
    private float bookPrice;

    private long roomId;
    private String roomNumber;
    private float roomPrice;
    private ArrayList<String> itemsList;
    private float transaction;
    private String userType;
   
    public Cart() {
        super();
    }
 
    public Cart(String title, String bookDescription,String roomNumber, String roomDescription) {
        
        super();
        this.title = title;
        this.bookDescription = bookDescription;

        this.roomNumber = roomNumber;
        this.roomDescription = roomDescription;

    }


    public CheckUser(){
        long userId = User.userId;
        userType = User.userType;
    }

    public AddToCart(String title, String roomNumber) {      
        itemsList.add(title);
        itemsList.add(roomNumber);
    }

    public long getbookId() {
        return bookId;
    }
 
    public void setBookId(long bookId) {
        this.bookId = bookId;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }


    public long getRoomId() {
        return roomId;
    }
 
    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public float getRoomPrice() {
        return roomPrice;
    }

 

    public String getRoomNumber() {
        return roomNumber;
    }
 
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public float Cost(float price, float transaction, float discount){

        if(userType == Student){
            discount = price * 0.25;
        }
        else if(userType == Charity){
            discount = price * 0.2;
        }
        else if(userType == Admin){
            discount = price * 0.5;
        }
        else{
            discount = 0;
        }

        transaction = price - discount;
        return transaction;

    }


    public long getItemsList() {
        return itemsList;
    }
 
    public void setItems(long itemsList) {
        this.itemsList = itemsList;
    }

 
}
 