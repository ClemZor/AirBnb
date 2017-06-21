package com.simplon.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class LogementDAO {
	
	public LogementDAO() {
		// TODO Auto-generated constructor stub
	}
	private String url="jdbc:mysql://localhost:3306/airbnb";
	private String user = "root";
	private String passwd = "admin";
	private Connection cn = null;
	private Statement st = null;
	ResultSet result = null;
	ResultSetMetaData resultData = null;


	public void seConnecter() {
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver O.K.");
		
			this.cn = DriverManager.getConnection(url, user, passwd);			
			System.out.println("Connexion effective !");	
		} catch ( Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void afficherLogement() {
		
		try {
			this.st= cn.createStatement();
			this.result = st.executeQuery("SELECT * FROM logement");
			this.resultData = result.getMetaData();
			System.out.println("\n**********************************");
		    //On affiche le nom des colonnes
		    for(int i = 1; i <= resultData.getColumnCount(); i++) {
		    	System.out.print("\t" + resultData.getColumnName(i).toUpperCase() + "\t *");
		    }
		         
		    System.out.println("\n**********************************");
		         
		      while(result.next()){         
		        for(int i = 1; i <= resultData.getColumnCount(); i++)
		          System.out.print("\t" + result.getObject(i).toString() + "\t |");
		            
		        System.out.println("\n---------------------------------");
		      }
		    result.close();
			st.close();
			cn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}