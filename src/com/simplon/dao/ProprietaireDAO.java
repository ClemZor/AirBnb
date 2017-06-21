package com.simplon.dao;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import com.simplon.beans.Proprietaire;


public class ProprietaireDAO {

	public ProprietaireDAO() {
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
	
	public void afficherReq1() {
		
		try{
			// création d'un objet statement
			this.st = cn.createStatement();
			// l'objet result contient le résultat de la requête sql
			this.result = st.executeQuery("SELECT * FROM PROPRIETAIRE");
			// on récupère les MetaData
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
		} catch ( Exception e) {
			e.printStackTrace();
		}		
	
	}
	
	public void testCreationProp( String nom, String prenom, String tel, String mail){
		try{
						
			// création d'un objet statement
			this.st = cn.createStatement();
						
			
			int ajout = st.executeUpdate("INSERT INTO proprietaire (nom, prenom, telephone, mail) "
					+ "VALUES ('"+ nom +"','"+ prenom +"','"+ tel +"','"+ mail +"')");			
			
			
		    st.close();
		} catch ( Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public ArrayList<Proprietaire> listerProp() {
		
		ArrayList<Proprietaire> proprietaires = new ArrayList<Proprietaire>();
		
		try{
			this.st = cn.createStatement();
			
			String requete = "SELECT * FROM proprietaire";
			
			ResultSet result = st.executeQuery(requete);
			
			while(result.next()) {
				
				Proprietaire proprio = new Proprietaire();
				
				proprio.setNom(result.getString(2));
				proprio.setPrenom(result.getString(3));
				proprio.setTelephone(result.getString(4));
				proprio.setMail(result.getString(5));
												
				proprietaires.add(proprio);				
			}
			
		} catch ( Exception e) {
			e.printStackTrace();
		}
		
		return proprietaires;
		
	}
	
	

}

