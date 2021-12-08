package com.springbootattempt.springbootattempt1;

import java.util.List;

public class CartServiceCon extends CartService{
    
    private final CartDAO CartDao;
    private final BookDAO BookDao;
    private final RoomDAO RoomDao;

    public CartServiceCon(CartDAO CartDao, BookDAO BookDao, RoomDAO RoomDao) {
        this.CartDao = CartDao;
        this.BookDao = BookDao;
        this.RoomDao = RoomDao;
      }



    @Override
    public List<Cart> findAllCarts() {
        return CartDao.findAll();
    }

    @Override
    public List<Book> findAllBooks() {
        return BookDao.findAll();
    }

    @Override
    public List<Room> findAllRooms() {
        return RoomDao.findAll();
    }





      @Override
      public List<Cart> findCartWithBook(String name) {
        var book = BookDao.findByName(name);
        return new ArrayList<>(book.getCart());
    }

      @Override
    public List<Cart> findCartWithRoom(String name) {
        var room = RoomDao.findByName(name);
        return new ArrayList<>(room.getCart());
    }


}