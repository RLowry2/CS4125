package com.springbootattempt.springbootattempt1;
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

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
 
    public Login(long id, String password) throws IOException {
        super();
        this.id = id;
        this.password = password;
        try{
            ArrayList<String> ar = new ArrayList<String>();
            File csvFile = new File("Attempt.csv");
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            String line = "";
            StringTokenizer st = null;
            int lineNumber = 0;
            int tokenNumber = 0;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                System.out.println(arr[0]+" " + arr[1]);
                lineNumber++;
            }
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
        finally {

        }
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
 

