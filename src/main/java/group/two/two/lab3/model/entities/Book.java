package group.two.two.lab3.model.entities;

import java.util.ArrayList;
import java.util.Objects;

public class Book {
    private Item item;
    private int year;
    private double price;
    private int amount;
    private String publishing_house;
    private ArrayList <Author> authors;

    public Book() {
    }

    public Book(Item item, int year, double price, int amount, String publishing_house) {
        this.item = item;
        this.year = year;
        this.price = price;
        this.amount = amount;
        this.publishing_house = publishing_house;
    }

    public Book(Item item, int year, double price, int amount, String publishing_house, ArrayList<Author> authors) {
        this.item = item;
        this.year = year;
        this.price = price;
        this.amount = amount;
        this.publishing_house = publishing_house;
        this.authors = authors;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public Item getItem_id() {
        return item;
    }

    public void setItem_id(Item item_id) {
        this.item = item_id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPublishing_house() {
        return publishing_house;
    }

    public void setPublishing_house(String publishing_house) {
        this.publishing_house = publishing_house;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year &&
                Double.compare(book.price, price) == 0 &&
                amount == book.amount &&
                Objects.equals(item, book.item) &&
                Objects.equals(publishing_house, book.publishing_house) &&
                Objects.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {

        return Objects.hash(item, year, price, amount, publishing_house, authors);
    }

    @Override
    public String toString() {
        return "Book{" +
                "item=" + item +
                ", year=" + year +
                ", price=" + price +
                ", amount=" + amount +
                ", publishing_house='" + publishing_house + '\'' +
                ", authors=" + authors +
                '}';
    }
}
