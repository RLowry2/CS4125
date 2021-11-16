package com.springbootattempt.springbootattempt1;
 
import java.io.FileReader;
import java.util.ArrayList;
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
 
    public Cart(String title, long bookId,String roomNumber, long roomId) {
        
        super();
        this.title = title;
        this.bookId = bookId;

        this.roomNumber = roomNumber;
        this.roomId = roomId;

    }


    public String CheckUser(){
        userType = User.userType;
    }

    public String AddToCart(String title, String roomNumber) {      
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

        if(userType == "Student"){
            discount = price * (1/4);
        }
        else if(userType == "Charity"){
            discount = price * (1/2);
        }
        else if(userType == "Admin"){
            discount = price * (1/2);
        }
        else{
            discount = 0;
        }

        transaction = price - discount;
        return transaction;

    }


    public ArrayList<String> getItemsList() {
        return itemsList;
    }
 
    public void setItems(ArrayList<String> itemsList) {
        this.itemsList = itemsList;
    }

 
}
 