package com.example.springbootproject.model;
 
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.persistence.*;
 
@Entity
public class Book {
    // @Id
    // @GeneratedValue(strategy=GenerationType.AUTO)
    // private long id;
    // private String title;
    // private String description;
   
    // public Book() {
    //     super();
    // }
 
    // public Book(String title, String description) {
    //     super();
    //     this.title = title;
    //     this.description = description;
    // }
 
    // public long getId() {
    //     return id;
    // }
 
    // public String getTitle() {
    //     return title;
    // }
 
    // public String getDescription() {
    //     return description;
    // }

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
}
 

