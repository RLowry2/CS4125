package com.springbootattempt.springbootattempt1;

import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;

public class BookDAOImpl implements BookDAO {

   String usertype;
   char[] array = new char[100];

    List<Book> books;
    List<double[]> data = new ArrayList<double[]>();

    public BookDAOImpl(){
        books = new ArrayList<Book>();
    }


    @Override
    public List<Book> getAllBooks() {
       return books;
    }

    @Override
    public Book getBookId(int id) {
       return books.get(id);
    }

    @Override
    public String getBookTitle(String name) {


      return name;
    }

    public double getBookPrice(double price){
       try{
         FileReader input = new FileReader("currentBook.csv");

         input.read(array);
         price = array[2];
         input.close();
       }
       catch(Exception e) {
         e.getStackTrace();
       }

       if (usertype == "Admin"){
         price = price - (price * 0.5);
       }

       else if (usertype == "Student"){
         price = price - (price * 0.2);
      }
       else if (usertype == "Charity"){
         price = price - (price * 0.1);
      }
      data.add(new double[] {price});

       return price;
    }

    

    @Override
    public void AddBookToCart(String title, String author, double price) {

      List<String> books = new ArrayList<>();
         
         StringBuilder sb = new StringBuilder();
         sb.append(title);
         sb.append(',');
         sb.append(author);
         sb.append(',');
         sb.append(price);
         sb.append('\n');
   

         System.out.println(books);
      }

      @Override
      public void RemoveBookToCart(String bookId, double price) {
        List<String> books = new ArrayList<>();
  
        books.remove(bookId);
        books.remove(price);
  
           System.out.println(books);
      }
}
