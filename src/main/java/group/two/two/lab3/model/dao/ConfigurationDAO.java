package group.two.two.lab3.model.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationDAO {
    @Bean
    public DAO dao() {
        return new ListDAO();
    }
}
