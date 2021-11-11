package com.springbootattempt.springbootattempt1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import com.springbootattempt.springbootattempt1.SignUp;


public class CsvWriter {
    public static void main(String[] args) throws IOException {
  
      try (FileWriter writer = new FileWriter("test.csv", true)) {
  
        StringBuilder sb = new StringBuilder();
        sb.append(firstname);
        sb.append(',');
        sb.append(lastname);
        sb.append('\n');
  
        writer.write(sb.toString());
  
        System.out.println("done!");
  
      } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
      }
  
    }
  }
