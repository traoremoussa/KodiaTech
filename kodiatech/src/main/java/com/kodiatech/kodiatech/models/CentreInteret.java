package com.kodiatech.kodiatech.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class CentreInteret {

	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Long id;
	
	private String intituler;
	
	@ManyToOne
	private Utilisateur utilisateur;

	public CentreInteret() {}
	
	public CentreInteret(String intituler, Utilisateur utilisateur) {
		super();
		this.intituler = intituler;
		this.utilisateur = utilisateur;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIntituler() {
		return intituler;
	}

	public void setIntituler(String intituler) {
		this.intituler = intituler;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	
}
