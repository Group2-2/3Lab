package group.two.two.lab3.model.dao;

import group.two.two.lab3.model.entities.Login;
import group.two.two.lab3.model.entities.User;

public interface UserDAO extends DAO {
    Login getLoginByLogin(String login);
    User getUserByLogin(String login);

    /**
     * for login user
     */
    boolean login(String login, String password);

    /**
     * for registration user
     * @param user
     * @return
     */
    boolean registr(User user);

    boolean login(Login login);
}
