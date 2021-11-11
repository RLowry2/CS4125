package com.springbootattempt.springbootattempt1;
 
import javax.persistence.*;
import com.springbootattempt.springbootattempt1.CsvWriter;
 
@Entity
public class SignUp {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    public String firstname;
    public String lastname;
    private String password;
   
    public SignUp() {
        super();
    }
 
    public SignUp(String firstname, String lastname, String password) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
    }
 
    public long setId() {

        return id;
    }

    public void addFirstname(String firstname) {
        
    }

    public void addLastname(String lastname) {
        
    }

    public void addPassword(String password) {
        
    }
}