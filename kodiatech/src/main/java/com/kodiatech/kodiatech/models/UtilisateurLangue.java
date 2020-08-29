package com.kodiatech.kodiatech.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class UtilisateurLangue {

	/**
	 * https://www.baeldung.com/jpa-many-to-many
	 */
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Long id;

	//===== lien d'association=======================
	@ManyToOne
	private Utilisateur utilisateur;

	private LangueEnum langueEnum;
	private LangueLevelEnum levelEnum;


	//construct 



	public UtilisateurLangue(Utilisateur utilisateur, LangueEnum langueEnum, LangueLevelEnum levelEnum) {
		super();
		this.utilisateur = utilisateur;
		this.langueEnum = langueEnum;
		this.levelEnum = levelEnum;
	}

	//================ getter / setter ===============
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public LangueEnum getLangueEnum() {
		return langueEnum;
	}

	public void setLangueEnum(LangueEnum langueEnum) {
		this.langueEnum = langueEnum;
	}

	public LangueLevelEnum getLevelEnum() {
		return levelEnum;
	}

	public void setLevelEnum(LangueLevelEnum levelEnum) {
		this.levelEnum = levelEnum;
	}





}
