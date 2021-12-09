package com.example.springbootproject.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import javax.persistence.*;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;


@Entity
public class RoomRental {
    @Id
    private long id;
    private long availability;
    

    public RoomRental() {
        super();
    }

    public long getID() {
        return id;
    }

    public long getAvailablity() {
        return availability;
    }

    public static void bookRoom(String room, String day) throws CsvException, IOException {
		CSVReader csvReader = new CSVReader(new FileReader("Availability.csv"));
		List<String[]> csvInListFormat = csvReader.readAll();
		csvInListFormat.forEach(x -> System.out.println(Arrays.toString(x)));		


		String csv = "availability.csv";
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
                    switch (day) {
                        case "Monday": if(read[1].equals(true)) {
                            read[1] = "false";
                            }
                            break;
                        case "Tuesday": if(read[2].equals(true)) {
                            read[2] = "false";
                            }
                            break;
                        case "Wednesday": if(read[3].equals(true)) {
                            read[3] = "false";
                            }
                            break;
                        case "Thursday": if(read[4].equals(true)) {
                            read[4] = "false";
                            }
                            break;
                        case "Friday": if(read[5].equals(true)) {
                            read[5] = "false";
                            }
                            break;
                    }
					break;
				} else {
					i++;
				}
			}
        }
        catch (IOException io) {
            System.out.println(io);
        }

		/* csvInListFormat.remove(i+1);
		FileWriter sw = new FileWriter("availability.csv");
		CSVWriter writer = new CSVWriter(sw);
		writer.writeAll(csvInListFormat);
		writer.close(); */
    }

 }
