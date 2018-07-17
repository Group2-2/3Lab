package group.two.two.lab3.model.dao;

import group.two.two.lab3.model.entities.Book;
import group.two.two.lab3.model.entities.Order;

public interface OrderDAO extends DAO {
    boolean addBook(int order_id, int book_id);
    boolean deleteBook(int order_id, int book_id);
    boolean makeOrderDone(int order_id);
    boolean addBook(Order order, Book book);
    boolean deleteBook(Order order, Book book);
    boolean makeOrderDone(Order order);
}
