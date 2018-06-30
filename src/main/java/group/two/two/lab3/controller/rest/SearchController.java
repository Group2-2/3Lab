package group.two.two.lab3.controller.rest;

import group.two.two.lab3.model.*;
import group.two.two.lab3.model.dao.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class SearchController {
    @Autowired
    private DAO dao;

    @RequestMapping(value = "/author", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseBody
    Answer<Author> author(HttpSession session) {
        Login login = (Login) session.getAttribute("login");
        Author author = null;
        if (login != null && dao.login(login)) {
            int i = (int) session.getAttribute("author");
            author = dao.getAuthor(i);
        }
        return new Answer<>("Author", true, author);
    }

    @RequestMapping(value = "/genre", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseBody
    Answer<Genre> genre(HttpSession session) {
        Login login = (Login) session.getAttribute("login");
        Genre genre = null;
        if (login != null && dao.login(login)) {
            int i = (int) session.getAttribute("genre");
            genre = dao.getGenre(i);
        }
        return new Answer<>("genre", true, genre);
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseBody
    Answer<List<Book>> search(HttpSession session) {
        Login login = (Login) session.getAttribute("login");
        Genre genre = null;
        if (login != null && dao.login(login)) {
            int i = (int) session.getAttribute("genre");
            genre = dao.getGenre(i);
        }
        return new Answer<>("genre", true, genre);
    }
}
