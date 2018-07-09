package group.two.two.lab3.controller.rest;

import group.two.two.lab3.model.*;
import group.two.two.lab3.model.dao.DAO;
import group.two.two.lab3.model.entities.Author;
import group.two.two.lab3.model.entities.Book;
import group.two.two.lab3.model.entities.Item;
import group.two.two.lab3.model.entities.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class SearchController {
    @Autowired
    private DAO dao;

    @RequestMapping(value = "/author", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseBody
    Answer<Author> author(@RequestParam(value="id", defaultValue="0") int id,
                          HttpSession session) {
        Login login = (Login) session.getAttribute("login");
        Author author = null;
        if (login != null && dao.login(login)) {
            author = dao.getAuthor(id);
        }
        return new Answer<>("Author", true, author);
    }

    @RequestMapping(value = "/genre", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseBody
    Answer<Item> genre(@RequestParam(value="id", defaultValue="0") int id,
                       HttpSession session) {
        Login login = (Login) session.getAttribute("login");
        Item genre = null;
        if (login != null && dao.login(login)) {
            genre = dao.getGenre(id);
        }
        return new Answer<>("genre", true, genre);
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseBody
    Answer<Book> book(@RequestParam(value="id", defaultValue="0") int id,
                      HttpSession session) {
        Login login = (Login) session.getAttribute("login");
        Book book = null;
        if (login != null && dao.login(login)) {
            book = dao.getBook(id);
        }
        return new Answer<>("book", true, book);
    }

    /*@RequestMapping(value = "/search", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseBody
    Answer<List<Book>> search(HttpSession session) {
        Login login = (Login) session.getAttribute("login");
        Item genre = null;
        if (login != null && dao.login(login)) {
            int i = (int) session.getAttribute("genre");
            genre = dao.getGenre(i);
        }
        return new Answer<>("genre", true, genre);
    }*/
}
