package kz.petsclinic.servlets;

import kz.petsclinic.store.PersonCache;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * delete person
 */
public class PersonDeleteServlet extends HttpServlet {

    private static final PersonCache PERSON_CACHE = PersonCache.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PERSON_CACHE.delete(Integer.valueOf(req.getParameter("id")));
        resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/person/view"));
    }
}
