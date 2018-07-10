package group.two.two.lab3.model.dao;

import group.two.two.lab3.model.entities.Author;
import group.two.two.lab3.model.entities.Book;

import java.util.List;

public interface BookDAO extends DAO {
    List<Book> getAllBooks();

    /**
     *
     * @param author обьект автора
     * @param orderBy - столбец по которому выполнить сортировку (дефолтно = id автора, если будет что-то ложное)
     * @param asc 1 если asc, 2 если desc
     * @return
     */
    List<Book> getBookByAuthor(Author author, String orderBy, boolean asc);

}
