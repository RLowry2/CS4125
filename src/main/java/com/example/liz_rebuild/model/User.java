package com.example.liz_rebuild.model;
 
import java.util.List;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
 
@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected long id;
    protected String firstName;
    protected String lastName;
    protected String userType = "standard"; //default type


    protected String email;

    @ManyToMany
    protected ArrayList<Book> rentedBooks = new ArrayList<>();;
    protected ArrayList<Book> rentedRooms = new ArrayList<>();;

    public User() {
        super();
    }

    public User(long id, String firstName, String lastName, String email, ArrayList<Book> books) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.rentedBooks = books;
    }
//------------------------------------------getters and setters---------------------------------------------------------
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*public void setBooks(List<Book> books) {
        this.rentedBooks = books;
    }*/

    public String userType() {
        return userType;
    }

    public void userType(String userType) {
        this.userType = userType;
    }

    public void returnRentedBooks(){}

    //----------------------------------------actual functionality------------------------------------------------------
    public List<Book> getBooks() {
        return rentedBooks;
    }

    public void saveToCart(String title, String bookDescription, double bookPrice,
                           String number, int size, double roomPrice) throws IOException {
        Cart.addBook(title, bookDescription, bookPrice);
        Cart.addRoom(number, size, roomPrice);
    }

    public void addRentedBook(String title, String bookDescription){
       rentedBooks.add(new Book(title,bookDescription));
    }

    public void returnRentedBooks(){
        Book.addRentedBook();
        rentedBooks.clear();
    }

    public void addRentedRoom(int number,int size,double price){
        rentedBooks.add(new Room(number, size, price));
    }

    public void returnRentedRooms(String roomID, int roomQuantity, boolean roomAvailability){
        Room.addRoom(roomID, roomQuantity, roomAvailability);
        rentedRooms.clear();

    }
    //------------------------------------------------------------------------------------------------------------------

    public String toString(){
        return firstName + "," + lastName
                + "," + email
                + "," + userType;
    }

    public boolean hasBook(Book book) {
        for(Book containedBook: getBooks()) {
            if(containedBook.getId() == book.getId()) {
                return true;
            }
        }
        return false;
    }

}
