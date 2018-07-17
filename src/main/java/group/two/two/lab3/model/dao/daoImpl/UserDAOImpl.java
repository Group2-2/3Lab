package group.two.two.lab3.model.dao.daoImpl;

import group.two.two.lab3.model.dao.UserDAO;
import group.two.two.lab3.model.entities.Login;
import group.two.two.lab3.model.entities.User;

public class UserDAOImpl implements UserDAO {
    @Override
    public void connection() {

    }

    @Override
    public void disconnection() {

    }

    @Override
    public Object getObjectById(int id) {
        return null;
    }

    @Override
    public Login getLoginByLogin(String login) {
        return null;
    }

    @Override
    public User getUserByLogin(String login) {
        return null;
    }

    @Override
    public boolean login(String login) {
        return false;
    }

    @Override
    public boolean registr(User user) {

        return false;
    }
}
