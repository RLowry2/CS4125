package com.springbootattempt.springbootattempt1;

import javax.persistence.*;
 
@Entity
public class Login {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private String email;
    private String password;

    public Login() {
        super();
    }

    public Login(String email, String password) {
        super();
        this.email = email;
        this.password = password;      
    }

    public String getEmail() {
        return email;

    }

    public String getPassword() {
        return password;
    }
}