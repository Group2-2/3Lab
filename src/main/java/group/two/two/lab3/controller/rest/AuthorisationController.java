package group.two.two.lab3.controller.rest;

import group.two.two.lab3.model.Answer;
import group.two.two.lab3.model.entities.Login;
import group.two.two.lab3.model.entities.User;
import group.two.two.lab3.model.dao.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class AuthorisationController {

    @Autowired
    private DAO dao;

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseBody
    Answer<Login> login(@RequestParam(value="login", defaultValue="login") String login,
                 @RequestParam(value="password", defaultValue="password") String password,
                        HttpSession session) {
        Login log =  new Login(login, password);
        boolean status = dao.login(log);
        if (status) {
            session.setAttribute("login", log);
        }
        return new Answer<>("Login", status, log);
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseBody
    Answer<User> registration(@RequestParam(value="login", defaultValue="login") String login,
                              @RequestParam(value="password", defaultValue="password") String password,
                              @RequestParam(value="firstname", defaultValue="firstname") String firstName,
                              @RequestParam(value="secondname", defaultValue="secondname") String secondName,
                              @RequestParam(value="phone", defaultValue="phone") String phone,
                              @RequestParam(value="email", required=false, defaultValue="email") String email,
                              HttpSession session) {
        User user = new User(firstName, secondName, phone, login, password);
        user.setEmail(email);
        boolean status = dao.register(user);
        if (status) {
            session.setAttribute("login", new Login(user));
        }
        return new Answer<>("Login", status, user);
    }
}
