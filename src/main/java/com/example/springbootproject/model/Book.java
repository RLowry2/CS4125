package com.example.springbootproject.model;
 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.persistence.*;
import java.util.*;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

 
@Entity
public class Book {

    public static void addBook(String title, String author, double price) throws IOException {
		try (FileWriter writer = new FileWriter("book.csv", true)) {

		StringBuilder sb = new StringBuilder();
		sb.append(title);
		sb.append(',');
		sb.append(author);
		sb.append(',');
		sb.append(price);
		sb.append('\n');

		writer.write(sb.toString());

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
    }

    public static void findBook() {

		String csv = "book.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplit = ",";
        String[] read = new String[0];
        try {
            br = new BufferedReader(new FileReader(csv));
            String headerLine = br.readLine();

            while ((line = br.readLine()) != null) {
				read = line.split(csvSplit);
				if(read[0].equals("Book1")) {
					removeBook();
				}
			}
        }
        catch (IOException io) {
            System.out.println(io);
        }
    }    
	
	public static void removeBook() {
	// 	CSVReader csvReader = new CSVReader(new FileReader("user.csv"));
	// 	List<String[]> row = csvReader.readAll();
	// 	row.forEach(x -> System.out.println(Arrays.toString(x)));

	// 	row.remove(rowNumber);
	// 	FileWriter sw = new FileWriter("book.csv");
	// 	CSVWriter writer = new CSVWriter(sw);
	// 	writer.writeAll(row);
	// 	writer.close();
	}
}
 

