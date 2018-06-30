package group.two.two.lab3.model;

public class Book {
    private String name;
    private int genre;
    private double price;
    private String about;
    private String izdatlstvo;

    public Book() {

    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getIzdatlstvo() {
        return izdatlstvo;
    }

    public void setIzdatlstvo(String izdatlstvo) {
        this.izdatlstvo = izdatlstvo;
    }

    public Book(String name, int genre, double price) {
        this.name = name;
        this.genre = genre;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
