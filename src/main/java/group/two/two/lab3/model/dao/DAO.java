package group.two.two.lab3.model.dao;

import group.two.two.lab3.model.Author;
import group.two.two.lab3.model.Genre;
import group.two.two.lab3.model.Login;
import group.two.two.lab3.model.User;
import org.springframework.stereotype.Component;

@Component
public interface DAO {
    boolean login(Login login);
    boolean register(User user);
    User getUser(String login);
    Author getAuthor(int id);
    Genre getGenre(int id);
}
