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

import dao.FiliereIDAO;





@WebServlet("/Filiere")
public class Filiere extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	 @EJB
     private FiliereIDAO daof;
 

	public Filiere() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String code = request.getParameter("code");
		
		if(daof.create(new entities.Filiere(code,nom)))
		{
			List<entities.Filiere> fieldList=daof.findAll();

			request.setAttribute("liste", fieldList);
			// Forward the request to the JSP
			request.getRequestDispatcher("/listeFil.jsp").forward(request, response);

			
		}
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<entities.Filiere> fieldList=daof.findAll();

		request.setAttribute("liste", fieldList);

		// Forward the request to the JSP
		request.getRequestDispatcher("/listeFil.jsp").forward(request, response);
		
	}

}
