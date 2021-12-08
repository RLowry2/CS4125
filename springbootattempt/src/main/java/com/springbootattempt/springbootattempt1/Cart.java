package com.springbootattempt.springbootattempt1;
 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.persistence.*;
 
@Entity
public class Cart extends User {
    // @Id
    // @GeneratedValue(strategy=GenerationType.AUTO)
    // private long bookId;
    // private String title;
    // private float bookPrice;

    // private long roomId;
    // private String roomNumber;
    // private float roomPrice;
    public static ArrayList<String> itemsList = new ArrayList<String>();
    // private float transaction;
    // private String userType;
   
    // public Cart() {
    //     super();
    // }
 
    // public Cart(String title, long bookId,String roomNumber, long roomId) {
        
    //     super();
    //     this.title = title;
    //     this.bookId = bookId;

    //     this.roomNumber = roomNumber;
    //     this.roomId = roomId;

    // }


    // public String CheckUser(){
    //     userType = User.userType;
    //     return userType;
    // }

    // Needs to be modified users
    public static void AddToCart(String title, String roomNumber) {   
        itemsList.add(title);
        itemsList.add(roomNumber);
    }

    // public long getbookId() {
    //     return bookId;
    // }
 
    // public String getTitle() {
    //     return title;
    // }
 
	public static void addBook(String title, String author, double price) throws IOException {
		try (FileWriter writer = new FileWriter("cart.csv", true)) {

		StringBuilder sb = new StringBuilder();
		sb.append(title);
		sb.append(',');
		sb.append(author);
		sb.append(',');
		sb.append(price);
		sb.append('\n');

		writer.write(sb.toString());

		} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
		}
	}


    // public long getRoomId() {
    //     return roomId;
    // }
 
	public static void addRoom(String number, int size, double price) throws IOException {
		try (FileWriter writer = new FileWriter("cart.csv", true)) {

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


    // public float getRoomPrice() {
    //     return roomPrice;
    // }

    // public String getRoomNumber() {
    //     return roomNumber;
    // }

    // public float Cost(float price, float transaction, float discount){

    //     if(userType == "Student"){
    //         discount = price * (1/4);
    //     }
    //     else if(userType == "Charity"){
    //         discount = price * (1/2);
    //     }
    //     else if(userType == "Admin"){
    //         discount = price * (1/2);
    //     }
    //     else{
    //         discount = 0;
    //     }

    //     transaction = price - discount;
    //     return transaction;

    // }


    // public ArrayList<String> getItemsList() {
    //     return itemsList;
    // }
 
    // public void setItems(ArrayList<String> itemsList) {
    //     this.itemsList = itemsList;
    // }

 
}
 