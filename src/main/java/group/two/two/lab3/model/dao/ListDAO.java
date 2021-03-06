package group.two.two.lab3.model.dao;

import group.two.two.lab3.model.entities.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Component
public class ListDAO implements DAO {
    private Map<String, User> map;
    private Map<Integer, Author> authors;
    private Map<Integer, List<Integer>> booksHasAuthors;
    private List<Book> books;

    public ListDAO() {
        map = new HashMap<>();
        authors = new HashMap<>();
        booksHasAuthors = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        booksHasAuthors.put(1, list);
        books = new ArrayList<>();
        authors.put(1, new Author("author", "surname", "about"));
        map.put("kam", new User("anton", "kudryavtsev", "1", "kam", "pass"));
    }

    @Override
    public void connection() {

    }

    @Override
    public void disconnection() {

    }

    public boolean login(Login login) {
        if (map.containsKey(login.getLogin())) {
            Login buf = new Login(map.get(login.getLogin()));
            return buf.equals(login);
        }
        return false;
    }

    public boolean register(User user) {
        if (!map.containsKey(user.getLogin())) {
            map.put(user.getLogin(), user);
            return true;
        }
        return false;
    }

    public User getUser(String login) {
        return map.get(login);
    }


    public Author getAuthor(int id) {
        return null;
    }


    public Item getGenre(int id) {
        return null;
    }


    public Book getBook(int id) {
        return null;
    }
}
