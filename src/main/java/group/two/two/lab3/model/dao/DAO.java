package group.two.two.lab3.model.dao;

import group.two.two.lab3.model.*;
import org.springframework.stereotype.Component;

@Component
public interface DAO {
    void connection();
    void disconnection();
    Object getObjectById(int id);
}
