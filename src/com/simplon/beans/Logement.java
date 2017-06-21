package com.simplon.beans;

public class Logement {
	
	private int id = 0;
	private String description = "";
	private int proprietaire_id = 0;
	private int adresse_id = 0;
	/**
	 * @param id
	 * @param description
	 * @param proprietaire_id
	 * @param adresse_id
	 */
	public Logement(int id, String description, int proprietaire_id, int adresse_id) {
		super();
		this.id = id;
		this.description = description;
		this.proprietaire_id = proprietaire_id;
		this.adresse_id = adresse_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getProprietaire_id() {
		return proprietaire_id;
	}
	public void setProprietaire_id(int proprietaire_id) {
		this.proprietaire_id = proprietaire_id;
	}
	public int getAdresse_id() {
		return adresse_id;
	}
	public void setAdresse_id(int adresse_id) {
		this.adresse_id = adresse_id;
	}
	
	
	

}
