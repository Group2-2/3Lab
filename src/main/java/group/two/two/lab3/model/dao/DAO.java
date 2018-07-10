package group.two.two.lab3.model.dao;

import group.two.two.lab3.model.*;
import group.two.two.lab3.model.entities.Item;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DAO {
    void connection();
    void disconnection();
    Object getObjectById(int id);

}
