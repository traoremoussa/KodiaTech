package com.kodiatech.kodiatech.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.NotNull;

@Entity
public class Experience {

	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Long id;

	private String intitulePoste;
	private TypeEmploiEnum typeEmploi; //CDI, Stage, ...
	private String lieu;
	private String entreprise;
	private String description; // la mission, techno...

	private boolean isOccuper;
	@NotNull(message="il faut definir la date du debut")
	@JsonFormat(pattern="dd-MM-yyyy ")
	private Date dateDebut;

	@Nullable
	@JsonFormat(pattern="dd-MM-yyyy ")
	private Date dateFin;
	//================ Liaison ====================================

	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private Utilisateur utilisateur;
	//=============================================================

	
	
	
	public Experience(String intitulePoste, TypeEmploiEnum typeEmploi, String lieu, String entreprise,
			String description, boolean isOccuper,
			@NotNull(message = "il faut definir la date du debut") Date dateDebut, Date dateFin,
			Utilisateur utilisateur) {
		super();
		this.intitulePoste = intitulePoste;
		this.typeEmploi = typeEmploi;
		this.lieu = lieu;
		this.entreprise = entreprise;
		this.description = description;
		this.isOccuper = isOccuper;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.utilisateur = utilisateur;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIntitulePoste() {
		return intitulePoste;
	}
	public void setIntitulePoste(String intitulePoste) {
		this.intitulePoste = intitulePoste;
	}
	public TypeEmploiEnum getTypeEmploi() {
		return typeEmploi;
	}
	public void setTypeEmploi(TypeEmploiEnum typeEmploi) {
		this.typeEmploi = typeEmploi;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isOccuper() {
		return isOccuper;
	}
	public void setOccuper(boolean isOccuper) {
		this.isOccuper = isOccuper;
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



}
