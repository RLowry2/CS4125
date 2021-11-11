package com.springbootattempt.springbootattempt1;
 
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
    private long id;
    private String firstName;
    private String lastName;
    
    
    private String email;
    @ManyToMany
    private List<Book> books;
 
    public User() {
        super();
    }
 
    public User(String firstName, String lastName, String email, List<Book> books) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.books = books;
    }
 
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
 
    public List<Book> getBooks() {
        return books;
    }
 
    public void setBooks(List<Book> books) {
        this.books = books;
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

