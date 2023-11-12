package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.EtudiantIDAO;
import dao.FiliereIDAO;
import entities.Filiere;

import jakarta.ejb.EJB;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Etudiant
 */

public class Etudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	@EJB
	private EtudiantIDAO dao;
	@EJB
	private FiliereIDAO daof;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		String action = request.getParameter("action");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String cne = request.getParameter("cne");

		entities.Etudiant e = new entities.Etudiant();
		Filiere f = new Filiere("IIR5", "informatique");

		e.setFn(prenom);
		e.setLn(nom);
		e.setCne(cne);
		

		if(dao.create(e))
		{
			List<entities.Etudiant> liste = dao.findAll();

		request.setAttribute("liste", liste);
		// Forward the request to the JSP
		request.getRequestDispatcher("listEtud.jsp").forward(request, response);}

	}

}
