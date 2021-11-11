package com.springbootattempt.springbootattempt1;
 
import javax.persistence.*;
 
@Entity
public class Login {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String password;
   
    public Login() {
        super();
    }
 
    public Login(long id, String password) {
        super();
        this.id = id;
        this.password = password;
    }
 
    public long getId() {
        return id;
    }

    /*public boolean compareID(long id) {
        id.compareTo(*database id*)
    }*/

    public String getPassword() {
        return password;
    }
}
 

