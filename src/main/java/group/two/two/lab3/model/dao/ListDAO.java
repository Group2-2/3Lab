package group.two.two.lab3.model.dao;

import group.two.two.lab3.model.Login;
import group.two.two.lab3.model.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


@Component
public class ListDAO implements DAO {
    private Map<String, User> map;

    public ListDAO() {
        map = new HashMap<>();
        map.put("kam", new User("anton", "kudryavtsev", "1", "kam", "pass"));
    }

    @Override
    public boolean login(Login login) {
        if (map.containsKey(login.getLogin())) {
            Login buf = new Login(map.get(login.getLogin()));
            return buf.equals(login);
        }
        return false;
    }

    @Override
    public boolean register(User user) {
        if (!map.containsKey(user.getLogin())) {
            map.put(user.getLogin(), user);
            return true;
        }
        return false;
    }

    @Override
    public User getUser(String login) {
        return map.get(login);
    }
}
