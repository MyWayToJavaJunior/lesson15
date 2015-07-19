package kz.petsclinic.servlets;

import kz.petsclinic.models.Cat;
import kz.petsclinic.models.Person;
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
        this.PERSON_CACHE.add(new Person(this.ids.incrementAndGet(), req.getParameter("nameOfPerson"), new Cat(req.getParameter("nameOfPet"))));
        resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/person/view"));
    }
}
