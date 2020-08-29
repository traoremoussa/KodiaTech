package com.kodiatech.kodiatech.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

@Entity
public class Formation {


	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Long id;

    @NotNull
	@JsonFormat(pattern="dd-MM-yyyy ")
	private Date dateDebut;

    @NotNull
	@JsonFormat(pattern="dd-MM-yyyy ")
	private Date dateFin;

	private String diplome;
	private String domaine;
	private String description;
	private String ecole;
	private boolean isEncours;

	//=================liason=========================
	/**
	 * on s'assure que le responsable soit save apres formation soit save (ou mise à jours))
	 */
	@ManyToOne( cascade= {CascadeType.PERSIST,CascadeType.MERGE})
	private Utilisateur utilisateur;
	//================================================

	public Formation() {
		// TODO Auto-generated constructor stub
	}



	public Formation(Date dateDebut, Date dateFin, String diplome, String domaine, String description, String ecole,
			Utilisateur utilisateur) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.diplome = diplome;
		this.domaine = domaine;
		this.description = description;
		this.ecole = ecole;
		this.utilisateur = utilisateur;
	}


	// getter setter 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEcole() {
		return ecole;
	}

	public void setEcole(String ecole) {
		this.ecole = ecole;
	}



	public boolean isEncours() {
		return isEncours;
	}



	public void setEncours(boolean isEncours) {
		this.isEncours = isEncours;
	}



	public Utilisateur getUtilisateur() {
		return utilisateur;
	}



	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}



}
