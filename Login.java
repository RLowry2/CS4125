package com.springbootattempt.springbootattempt1;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.persistence.*;

@Entity
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String email;
    private String password;

    public Login() {
        super();
    }

    public static boolean validateLogin(String email, String password) {
        boolean accessGranted = false;
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("user.csv"));
            String row;
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(",");
                for (int i = 0; i <= data.length; i++) {
                    if (data[i] == email) {
                        String checkPassword = data[i + 1];
                        if (checkPassword == password) {
                            accessGranted = true;
                        }
                    }
                }
            }
            csvReader.close();
        } catch (Exception e) {
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
