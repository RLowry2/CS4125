package com.example.liz_rebuild.serverlet;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
 
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                
                String htmlResponse = "<html>";

                String row;
                boolean accessGranted = false;

                BufferedReader csvReader = new BufferedReader(new FileReader("Attempt.csv"));
                while((row = csvReader.readLine()) != null) {
                    String[] data = row.split(",");
                    for(int i = 0; i <= data.length; i++ ){
                        if(data[i] == email) {
                            String checkPassword = data[i+1];
                            if(checkPassword == password){
                                accessGranted = true;
                            }
                        }
                    }
                }
                csvReader.close();
                if(accessGranted == true){
                    htmlResponse += "<a href='home.html'>";
                    htmlResponse += "</html>";
                }
        } 
}