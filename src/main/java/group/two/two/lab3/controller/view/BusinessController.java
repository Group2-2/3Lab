package group.two.two.lab3.controller.view;

import group.two.two.lab3.model.entities.Login;
import group.two.two.lab3.model.dao.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class BusinessController {

    @Autowired
    private DAO dao;

    @GetMapping("/search")
    String search(HttpSession session) {
        Login login = (Login) session.getAttribute("login");
        if (login != null && dao.login(login)) {
            return "search";
        } else {
            return "login";
        }
    }

    @GetMapping("/profile")
    String profile(HttpSession session) {
        Login login = (Login) session.getAttribute("login");
        if (login != null && dao.login(login)) {
            return "profile";
        } else {
            return "login";
        }
    }
}
