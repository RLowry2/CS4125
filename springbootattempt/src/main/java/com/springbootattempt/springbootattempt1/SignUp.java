package com.springbootattempt.springbootattempt1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.persistence.*;

public class SignUp {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String firstname;
  private String lastname;
  private String password;

  public SignUp() {
    super();
  }

  public SignUp(String firstname, String lastname, String password) throws IOException {
    super();
    this.firstname = firstname;
    this.lastname = lastname;
    this.password = password;

    try {
      ArrayList<String> ar = new ArrayList<String>();
      File csvFile = new File("Attempt.csv");
      BufferedReader br = new BufferedReader(new FileReader(csvFile));
      String line = "";
      StringTokenizer st = null;
      int lineNumber = 0;
      int tokenNumber = 0;
      while ((line = br.readLine()) != null) {
        String[] arr = line.split(",");
        System.out.println(arr[0] + " " + arr[1]);
        lineNumber++;
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    } finally {

    }
  }
}