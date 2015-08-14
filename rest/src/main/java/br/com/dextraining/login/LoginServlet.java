package br.com.dextraining.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = -7029498154691731648L;
	public static final String LOGGED_USER = "loggedUser";

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String login = req.getParameter("login");
		String senha = req.getParameter("password");
		if(login.equals("admin") && senha.equals("123")) {
			req.getSession().setAttribute(LOGGED_USER, login);
			resp.sendRedirect("/logged");
		} else
			resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String usuario = req.getSession().getAttribute(LOGGED_USER).toString();
		resp.getWriter().write(usuario);
	}
	
	

	
}
