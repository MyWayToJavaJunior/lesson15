package kz.petsclinic.servlets;

import kz.petsclinic.store.PersonCache;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * find
 */
public class PersonFindServlet extends HttpServlet {

    private final PersonCache PERSON_CACHE = PersonCache.getInstance();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("nameOfPerson") != null || req.getParameter("nameOfPet") != null)
        req.setAttribute("findedPersons", this.PERSON_CACHE.finded(req.getParameter("nameOfPerson"), req.getParameter("nameOfPet")));
        req.getRequestDispatcher("/views/person/FindPerson.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}