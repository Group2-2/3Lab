package group.two.two.lab3.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class BusinessController {
    @GetMapping("/search")
    String search() {
        return "search";
    }
}
