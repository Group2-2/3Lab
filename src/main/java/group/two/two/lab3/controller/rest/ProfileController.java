package group.two.two.lab3.controller.rest;

import group.two.two.lab3.model.Answer;
import group.two.two.lab3.model.Login;
import group.two.two.lab3.model.User;
import group.two.two.lab3.model.dao.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class ProfileController {
    @Autowired
    private DAO dao;

    @RequestMapping(value = "/profile", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseBody
    Answer<User> profile(HttpSession session) {
        Login login = (Login) session.getAttribute("login");
        boolean status = false;
        User user = null;
        if (login != null && dao.login(login)) {
            status = true;
            user = dao.getUser(login.getLogin());
        }
        return new Answer<>("Profile", status, user);
    }
}
