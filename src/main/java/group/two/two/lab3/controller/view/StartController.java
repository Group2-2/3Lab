package group.two.two.lab3.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class StartController {
    @GetMapping("/")
    String start(HttpSession session) {
        session.removeAttribute("login");
        return "index";
    }

    @GetMapping("/login")
    String login() {
        return "login";
    }

    @GetMapping("/registration")
    String registration() {
        return "registration";
    }
}
