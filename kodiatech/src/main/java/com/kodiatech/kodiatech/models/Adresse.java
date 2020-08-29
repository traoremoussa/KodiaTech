package com.kodiatech.kodiatech.models;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	
	private int numeroRue;
	private String rue;
	private String codePostal;
	private String ville;
	
	
	//Construct 
	public Adresse() {
		super();
	}

	public Adresse(int numeroRue, String rue, String codePostal, String ville) {
		super();
		this.numeroRue = numeroRue;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	//getter setter
	public int getNumeroRue() {
		return numeroRue;
	}
	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	
	
	
	

}
