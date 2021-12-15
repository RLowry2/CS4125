package com.example.springbootproject.model;
 
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.persistence.*;

import com.opencsv.exceptions.CsvException;
 
@Entity
public class Cart extends User {
 
	public static void addBook(String title, String author, double price) throws IOException, CsvException {
		try (FileWriter writer = new FileWriter("cart.csv", true)) {

		StringBuilder sb = new StringBuilder();
		sb.append(title);
		sb.append(',');
		sb.append(author);
		sb.append(',');
		sb.append(price);
		sb.append('\n');

		writer.write(sb.toString());

        Book.removeBook(title);

		} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
		}
	}
 
	public static void addRoom(String number, int size, double price) throws IOException {
		try (FileWriter writer = new FileWriter("cart.csv", true)) {

		StringBuilder sb = new StringBuilder();
		sb.append(number);
		sb.append(',');
		sb.append(size);
		sb.append(',');
		sb.append(price);
		sb.append('\n');

		writer.write(sb.toString());

		} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
		}
	} 
}
 
