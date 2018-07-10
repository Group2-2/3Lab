package group.two.two.lab3.model.dao;

import group.two.two.lab3.model.entities.Author;
import group.two.two.lab3.model.entities.Book;


import java.util.List;

public interface AuthorDAO extends DAO {
    List<Author> getAuthorsByBook(int id);
    List<Author> getAuthorsByBook(Book book);
}
