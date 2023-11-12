package controller;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


import dao.IDaoLocal;
import dao.UserIDAO;
import entities.User;


@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private UserIDAO dao;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		dao.create(new User("admin","1234"));
	    
		
		   
			String login = request.getParameter("login");
			String pwd = request.getParameter("pwd");
			boolean x = false;
			
			for(User u : dao.findAll())
			{
				if(u.getLogin().equals("admin") && u.getPsd().equals("1234"))
				{
					x=true;
				}
				
				
			}
			
			if(x == true)
			{
				response.sendRedirect("welcome.jsp");
			}
			else 
			{
				response.setContentType("text/html"); // Set the content type to HTML
		        PrintWriter out = response.getWriter();
		        
		        out.println(" ERROR ! User does not exist !");
		        
			}
			
			
			
	}
}
	


