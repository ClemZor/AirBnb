package com.simplon.beans;

public class Adresse {
		private int id = 0;
		private int numero = 0;
		private String rue = "";
		private String ville = "";
		/**
		 * @param id
		 * @param numero
		 * @param rue
		 * @param ville
		 */
		public Adresse(int id, int numero, String rue, String ville) {
			super();
			this.id = id;
			this.numero = numero;
			this.rue = rue;
			this.ville = ville;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public String getRue() {
			return rue;
		}
		public void setRue(String rue) {
			this.rue = rue;
		}
		public String getVille() {
			return ville;
		}
		public void setVille(String ville) {
			this.ville = ville;
		}
		
		
		
		
		
}
