package com.simplon.beans;

public class Proprietaire {

	//colonnes
	private int id = 0;
	private String nom = "";
	private String prenom = "";
	private String telephone;
	private String mail = "";
	// Liste des logements 
	//private Set<Logement> listeLogement = new HashSet<Logement>();
	
	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param telephone
	 * @param mail
	 */
	public Proprietaire(int id, String nom, String prenom, String telephone, String mail) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.mail = mail;
	}
	public Proprietaire(){};
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}	
	
		
}
