package com.example.springbootproject.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.persistence.*;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;


@Entity
public class SignUp {
  
	public static void logUser(String email, String password) throws IOException {
		try (FileWriter writer = new FileWriter("user.csv", true)) {

		StringBuilder sb = new StringBuilder();
		sb.append(email);
		sb.append(',');
		sb.append(password);
		sb.append('\n');

		writer.write(sb.toString());

		} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
		}
	}

	public static void loginUser(String email, String password) throws IOException, CsvException {
		CSVReader csvReader = new CSVReader(new FileReader("user.csv"));


		String csv = "user.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplit = ",";
        String[] read = new String[0];
		int i = 0; 

		try {
            br = new BufferedReader(new FileReader(csv));
            String headerLine = br.readLine();

            while ((line = br.readLine()) != null) {
				read = line.split(csvSplit);
				if(read[0].equals(email) && read[1].equals(password) ) {
					System.out.println("User logged in.");
					break;
				} else {
					i++;
				}
			}
        }
        catch (IOException io) {
            System.out.println(io);
        }
    }    
}