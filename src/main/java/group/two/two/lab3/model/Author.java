package group.two.two.lab3.model;

public class Author {
    private String name;
    private String surname;
    private String about;

    public Author() {

    }

    public Author(String name, String surname, String about) {
        this.name = name;
        this.surname = surname;
        this.about = about;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
