package controller;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dao.FiliereIDAO;
import entities.Filiere;



public class FilEtud extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private FiliereIDAO daof;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FilEtud() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<entities.Filiere> listf = new ArrayList<Filiere>();

		Filiere f = new Filiere("IIR5","informatique");
		listf.add(f);
		request.setAttribute("liste", listf);

		//request.getRequestDispatcher("AjoutEtud.jsp").forward(request, response);

	}

}
