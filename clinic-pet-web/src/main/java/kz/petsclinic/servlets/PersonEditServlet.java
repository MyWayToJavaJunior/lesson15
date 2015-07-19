package kz.petsclinic.servlets;

import kz.petsclinic.models.Cat;
import kz.petsclinic.models.Person;
import kz.petsclinic.store.PersonCache;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * edit person
 */
public class PersonEditServlet extends HttpServlet {

    final AtomicInteger ids = new AtomicInteger();

    private static final PersonCache PERSON_CACHE = PersonCache.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("person", this.PERSON_CACHE.get(Integer.valueOf(req.getParameter("id"))));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/person/EditPerson.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.PERSON_CACHE.edit(new Person(this.ids.incrementAndGet(), req.getParameter("nameOfPerson"), new Cat(req.getParameter("nameOfPet"))));
        resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/person/view"));
    }
}
