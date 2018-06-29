package group.two.two.lab3.model;

public class User {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private boolean admin = false;
    private Login login;

    public User() {
    }

    public User(String firstName, String lastName, String phone, String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.login = new Login(login, password);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getLogin() {
        return login.getLogin();
    }

    public void setLogin(String login) {
        this.login.setLogin(login);
    }

    public String getPassword() {
        return login.getPassword();
    }

    public void setPassword(String password) {
        this.login.setPassword(password);
    }
}
