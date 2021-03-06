package group.two.two.lab3.model.entities;

import java.util.Objects;

public class Login {

    private String login;
    private String password;

    public Login(){}

    public Login(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Login(User user) {
        login = user.getLogin();
        password = user.getPassword();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Login login1 = (Login) o;
        return Objects.equals(login, login1.login) &&
                Objects.equals(password, login1.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(login, password);
    }

    public boolean checkLogin() {
        if (this.login.isEmpty() || this.password.isEmpty()) {
            return  false;
        }
        return true;
    }
}
