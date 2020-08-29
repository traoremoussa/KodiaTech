package com.kodiatech.kodiatech.models;

import javax.persistence.Entity;

@Entity
public class Outil extends Competence {

	public Outil(Long id, String libelle, Utilisateur utilisateur) {
		super(id, libelle, utilisateur);
		// TODO Auto-generated constructor stub
	}

}
