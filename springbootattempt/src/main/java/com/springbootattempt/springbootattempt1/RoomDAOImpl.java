package com.springbootattempt.springbootattempt1;

import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;

public class RoomDAOImpl implements RoomDAO {

   String usertype;
   char[] array = new char[100];

    List<Book> books;
    List<double[]> data = new ArrayList<double[]>();

    public RoomDAOImpl(){
        books = new ArrayList<Book>();
    }


    @Override
    public List<Book> getAllRooms() {
       return books;
    }

    @Override
    public Book getRoomId(int bookId) {
       return books.get(bookId);
    }

    @Override
    public String getRoomName(String name) {
      return name;
    }

    public double getRoomPrice(double price){
       try{
         FileReader input = new FileReader("currentRoom.csv");

         input.read(array);
         price = array[1];
         input.close();
       }
       catch(Exception e) {
         e.getStackTrace();
       }

       if (usertype == "Admin"){
         price = price - (price * 0.5);
       }

       else if (usertype == "Student"){
         price = price - (price * 0.1);
      }
       else if (usertype == "Charity"){
         price = price - (price * 0.2);
      }
      
      data.add(new double[] {price});
      
       return price;
    }

    

    @Override
    public void AddRoomToCart(String RoomNum, double price) {

      List<String> books = new ArrayList<>();
         
         StringBuilder sb = new StringBuilder();
         sb.append(RoomNum);
         sb.append(',');
         sb.append(price);
         sb.append('\n');
   

         System.out.println(books);
      }

    @Override
    public void RemoveRoomToCart(String RoomNum, double price) {
      List<String> books = new ArrayList<>();

      books.remove(RoomNum);
      books.remove(price);

         System.out.println(books);
    }
}
