package com.springbootattempt.springbootattempt1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

@WebServlet("/signUpServlet")
public class SignUpServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String password = request.getParameter("password");

        // try (FileWriter writer = new FileWriter("Attempt.csv", true)) {

        // StringBuilder sb = new StringBuilder();
        // sb.append(firstname);
        // sb.append(',');
        // sb.append(lastname);
        // sb.append(',');
        // sb.append(password);
        // sb.append('\n');

        // writer.write(sb.toString());

        // System.out.println("done!");

        // } catch (FileNotFoundException e) {
        // System.out.println(e.getMessage());
        // }

        PrintWriter writer = response.getWriter();

        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your firstname is: " + firstname + "<br/>";
        htmlRespone += "Your lastname is" + lastname + "<br/>";
        htmlRespone += "Your password is: " + password + "</h2>";
        htmlRespone += "</html>";

        writer.println(htmlRespone);

        // String htmlResponse = "<html>";

        // String row;
        // boolean accessGranted = false;

        // try (FileWriter writer = new FileWriter("Attempt.csv", true)) {

        // StringBuilder sb = new StringBuilder();
        // sb.append(firstname);
        // sb.append(',');
        // sb.append(lastname);
        // sb.append(',');
        // sb.append(password);
        // sb.append('\n');

        // writer.write(sb.toString());

        // System.out.println("done!");

        // } catch (FileNotFoundException e) {
        // System.out.println(e.getMessage());
        // }

        // if (accessGranted == true) {
        // htmlResponse += "<a href='home.html'>";
        // }
        // htmlResponse += "</html>";
    }
}