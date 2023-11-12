package controller;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import dao.UserIDAO;

/**
 * Servlet implementation class User
 */

@WebServlet("/User")
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private UserIDAO dao;
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String mdp = request.getParameter("mdp");
		
		List<entities.User> liste = new ArrayList();
		dao.create(new entities.User(login,mdp));
		
		boolean x=false;
		for(entities.User u : dao.findAll())
		{
			if(u != null)
			{
				x=true;
				liste.add(u);
				
			}
		}
		
		if(x == true)
		{
			request.setAttribute("liste", liste);
			// Forward the request to the JSP
			request.getRequestDispatcher("listeUser.jsp").forward(request, response);

		}
		else 
		{
			response.setContentType("text/html"); // Set the content type to HTML
	        PrintWriter out = response.getWriter();
	        
	        out.println("ERROR ! ");   
		}
	}
}
