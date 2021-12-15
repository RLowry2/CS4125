package com.example.springbootproject.model;

import java.io.FileReader;
import java.util.*;
import javax.persistence.*;

import com.opencsv.CSVReader;

@Entity
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String email;
    private String password;

    public Login() {
        super();
    }

    public static boolean validateLogin(String email, String password){
        boolean accessGranted=false;
        try{
            CSVReader csvReader = new CSVReader(new FileReader("user.csv"));
            // List<String[]> row = csvReader.readAll();
            // row.forEach(x -> System.out.println(Arrays.toString(x)));

            String[] lineInArray;
            lineInArray = csvReader.readNext();

            System.out.println("Line in array" + lineInArray);

            while(lineInArray != null){ 
                
                System.out.println("While loop");

                for(int i = 0; i <= lineInArray.length; i++){
                    if(i == lineInArray.length){
                        accessGranted = false;
                        
                        System.out.println(lineInArray + "Access Granted False");
                        
                    }else if(lineInArray[i] == email) {
                        
                        System.out.println("Access Granted True");

                        String checkPassword = lineInArray[i+1];
                        if(checkPassword == password){
                            accessGranted = true;
                        }
                    } 
                }
                return accessGranted;
            }
            
            System.out.println(accessGranted);

            csvReader.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return accessGranted;
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
