package com.kodiatech.kodiatech.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Utilisateur {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String nom;
	private String prenom;
	private String telephone;
	private String email;

	//private String photoProfil;
	//===========================La liaison ===========================================
	
	//Adresse 
	@Embedded
	private Adresse adresse;
	
	
	//formation
	@OneToMany(mappedBy="utilisateur",cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JsonBackReference
	private List<Formation> formations=new ArrayList<Formation>();
	
	// experiences
	 @JsonBackReference
	@OneToMany(mappedBy="utilisateur",cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private List<Experience> experiences=new ArrayList<>();
	
	// centre d'interet 
	@OneToMany(mappedBy="utilisateur")
	private List<CentreInteret> centreInterets=new ArrayList<>();
	
	// langues
	@OneToMany(mappedBy="utilisateur")
	private List<UtilisateurLangue> utilisateurLangues=new ArrayList<UtilisateurLangue>();
	
	//competences 
	// langues
	@OneToMany(mappedBy="utilisateur")
	private List<Competence> competences=new ArrayList<>();
	//=================================================================================	
	
	// construct 
	/**
	 * default obligatoire pour recuperer les donnees au niveau de controleur 
	 */
	public Utilisateur() {
		super();
	}
	
	
	public Utilisateur(String nom, String prenom, String telephone, String email, Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
	}

	

	public long getId() {
		return id;
	}
	public List<Competence> getCompetences() {
		return competences;
	}
	public void setCompetences(List<Competence> competences) {
		this.competences = competences;
	}
	public void setId(long id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public List<Formation> getFormations() {
		return formations;
	}
	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}
	public List<Experience> getExperiences() {
		return experiences;
	}
	public void setExperiences(List<Experience> experiences) {
		this.experiences = experiences;
	}
	public List<CentreInteret> getCentreInterets() {
		return centreInterets;
	}
	public void setCentreInterets(List<CentreInteret> centreInterets) {
		this.centreInterets = centreInterets;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<UtilisateurLangue> getUtilisateurLangues() {
		return utilisateurLangues;
	}

	public void setUtilisateurLangues(List<UtilisateurLangue> utilisateurLangues) {
		this.utilisateurLangues = utilisateurLangues;
	} 




}
