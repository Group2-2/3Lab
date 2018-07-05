package group.two.two.lab3.model;

public class Item {
    private String name;
    private Integer genre = null;
    private String about;

    public Item() {

    }

    public Item(String name, Integer genre, String about) {
        this.name = name;
        this.genre = genre;
        this.about = about;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGenre() {
        return genre;
    }

    public void setGenre(Integer genre) {
        this.genre = genre;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
