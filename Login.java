package com.springbootattempt.springbootattempt1;
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.*;

import javax.persistence.*;
 
@Entity
public class Login {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String email;
    private String password;
    private String idString;

    public Login() {
        super();
    }
 
    Scanner sc = new Scanner(System.in);

    id = sc.nextLong();
    password = sc.nextLine();

    public Login(String email, String password) {
        super();
        this.email = email;
        this.password = password; 
        idString = Long.toString(id);  
        Scanner scanner = new Scanner(new File("Attempt.csv"));
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            if(scanner.next() == idString){
                String correctEmail;
            }
        }
        scanner.close();     
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
 

