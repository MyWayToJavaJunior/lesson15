package kz.petsclinic.servlets;

import kz.petsclinic.store.UserCache;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * view
 */
public class UserViewServlet extends HttpServlet {

	private final UserCache USER_CACHE = UserCache.getInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("users", this.USER_CACHE.values());
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/user/UserView.jsp");
		dispatcher.forward(req, resp);
	}

}