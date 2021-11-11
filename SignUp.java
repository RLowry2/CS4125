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
 
    public SignUp(long id, String password) {
        super();
        this.id = id;
        this.password = password;
    }
 
    public long getId() {
        return id;
    }

    //TODO implement
    public boolean compareID(long id) {
      //  id.compareTo(*database id*);
        return true;
    }

    public String getPassword() {
        return password;
    }
}
 

