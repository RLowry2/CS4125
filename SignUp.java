package com.springbootattempt.springbootattempt1;
 
import javax.persistence.*;
 
@Entity
public class SignUp {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String firstname;
    private String lastname;
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

    public String getPassword() {
        return password;
    }
}
 

