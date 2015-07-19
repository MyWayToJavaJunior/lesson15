package kz.petsclinic.servlets;

import kz.petsclinic.models.*;
import kz.petsclinic.store.PersonCache;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * create person
 */
public class PersonCreateServlet extends HttpServlet {

    final AtomicInteger ids = new AtomicInteger();

    private final PersonCache PERSON_CACHE = PersonCache.getInstance();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AbstractPet pet;
        switch (req.getParameter("ClassOfPet")) {
            default:
            case "Cat":     pet = new Cat(req.getParameter("nameOfPet"));
                            break;
            case "Bird":    pet = new Bird(req.getParameter("nameOfPet"));
                            break;
            case "Dog":     pet = new Dog(req.getParameter("nameOfPet"));
        }
        this.PERSON_CACHE.add(new Person(this.ids.incrementAndGet(), req.getParameter("nameOfPerson"), pet));
        resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/person/view"));
    }
}
