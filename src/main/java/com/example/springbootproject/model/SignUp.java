package com.example.springbootproject.model;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.persistence.*;

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
}