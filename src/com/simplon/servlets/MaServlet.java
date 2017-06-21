package com.simplon.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MaServlet")
public class MaServlet extends HttpServlet {

	 /**
     * @see HttpServlet#HttpServlet()
     */
    public MaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
	 public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{

		 this.getServletContext().getRequestDispatcher( "/WEB-INF/templates/index.jsp" ).forward( request, response );
//		 RequestDispatcher dispatcher;
//			
//			String pageProp =request.getParameter("pageProp");
//			String pageLogmt = request.getParameter("pageLogmt");
//			if (pageProp != null) {
//				dispatcher=request.getRequestDispatcher("/WEB-INF/templates/pageCreaProp.jsp");				
//			}else if (pageLogmt != null ) {
//				dispatcher = request.getRequestDispatcher("/WEB-INF/templates/pageCreaLog.jsp");
//			}
//			else {
//				dispatcher=request.getRequestDispatcher("/WEB-INF/templates/index.jsp");
//			}
//			dispatcher.forward(request, response);
//		 
		 

	    }
	 
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}

}
