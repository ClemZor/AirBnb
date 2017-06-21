package com.simplon.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplon.beans.Proprietaire;
import com.simplon.dao.ProprietaireDAO;


public class AjoutProprio extends HttpServlet {

	public AjoutProprio() {
		// TODO Auto-generated constructor stub
	}

	 public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{

		ProprietaireDAO proprio = new ProprietaireDAO();
		proprio.seConnecter();
		ArrayList<Proprietaire> listeProprio = proprio.listerProp();
		request.setAttribute("listeproprio", listeProprio);
		this.getServletContext().getRequestDispatcher("/WEB-INF/templates/pageCreaProp.jsp").forward( request, response );
	}
		 
		 
	 
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			//doGet(request, response);
		 	ProprietaireDAO Proprio = new ProprietaireDAO();
			Proprio.seConnecter();
			ArrayList<Proprietaire> listeProprio = Proprio.listerProp();
			request.setAttribute("listeproprio", listeProprio);
						
			
		 System.out.println("je suis dans le DoPOSt");
			 String nom = request.getParameter("nomProp");
			 String prenom = request.getParameter("prenomProp");
			 String tel = request.getParameter("telProp");
			 String mail = request.getParameter("mailProp");
			 
			 if ( verifierDonnees(nom)== 1 && verifierDonnees(prenom) == 1 && verifierDonnees(tel) == 1 && verifierDonnees(mail) == 1 ) {
			 ProprietaireDAO proprio = new ProprietaireDAO();
			 proprio.seConnecter();
			 proprio.testCreationProp(nom, prenom, tel, mail );
			 this.getServletContext().getRequestDispatcher("/WEB-INF/templates/pageCreaLog.jsp").forward( request, response );
			 }
			 else { this.getServletContext().getRequestDispatcher("/WEB-INF/templates/pageCreaProp.jsp").forward( request, response ); }
			 			
		}
	 
	 
	 
	 
	 public int verifierDonnees( String donnee) {
		 if ( donnee == "" || donnee == null ) {		 
			 	return 0;
		 }
		 else return 1;
	 }

}
