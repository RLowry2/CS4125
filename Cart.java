package com.springbootattempt.springbootattempt1;
 
import javax.persistence.*;
 
@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long bookId;
    private String title;
    private String bookDescription;

    private long roomId;
    private String roomNumber;
    private String roomDescription;
    private ArrayList<String> total;
   
    public Cart() {
        super();
    }
 
    public Cart(String title, String bookDescription,String roomNumber, String roomDescription) {
        
        


        super();
        this.title = title;
        this.bookDescription = bookDescription;

        this.roomNumber = roomNumber;
        this.roomDescription = roomDescription;

        total.add(title);
        total.add(roomNumber);

    }
 
    public long getbookId() {
        return bookId;
    }
 
    public void setBookId(long bookId) {
        this.id = bookId;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public String getBookDescription() {
        return bookDescription;
    }
 
    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }






    public long getBookId() {
        return roomId;
    }
 
    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }
 
    public String getRoomNumber() {
        return roomNumber;
    }
 
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
 
    public String getRoomDescription() {
        return roomDescription;
    }
 
    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }



    public long getTotal() {
        return total;
    }
 
    public void setTotal(long total) {
        this.total = total;
    }
 
}
 