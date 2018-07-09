package group.two.two.lab3.model.dao;

import group.two.two.lab3.model.entities.Item;

import java.util.List;

public interface ItemDAO extends DAO {
   List<Item> getAllItems();
   List<Item> getThemes();
   List<Item> getBooks();
}
