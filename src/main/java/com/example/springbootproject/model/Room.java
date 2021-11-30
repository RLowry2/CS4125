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
public class Room {

    // roomAvailability is true for room being available, false for booked already
    public static void addRoom(String roomID, int roomQuantity, boolean roomAvailability) throws IOException {
		try (FileWriter writer = new FileWriter("room.csv", true)) {

		StringBuilder sb = new StringBuilder();
		sb.append(roomID);
		sb.append(',');
		sb.append(roomQuantity);
		sb.append(',');
		sb.append(roomAvailability);
		sb.append('\n');

		writer.write(sb.toString());

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
    }

    public static void removeRoom(String room) throws CsvException, IOException {
		CSVReader csvReader = new CSVReader(new FileReader("room.csv"));
		List<String[]> csvInListFormat = csvReader.readAll();
		csvInListFormat.forEach(x -> System.out.println(Arrays.toString(x)));		


		String csv = "room.csv";
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
				if(read[0].equals(room)) {
					break;
				} else {
					i++;
				}
			}
        }
        catch (IOException io) {
            System.out.println(io);
        }

		csvInListFormat.remove(i+1);
		FileWriter sw = new FileWriter("room.csv");
		CSVWriter writer = new CSVWriter(sw);
		writer.writeAll(csvInListFormat);
		writer.close();
    }    
	
}