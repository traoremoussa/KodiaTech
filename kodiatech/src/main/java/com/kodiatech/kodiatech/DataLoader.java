package com.kodiatech.kodiatech;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.kodiatech.kodiatech.models.Adresse;
import com.kodiatech.kodiatech.models.Experience;
import com.kodiatech.kodiatech.models.Formation;
import com.kodiatech.kodiatech.models.TypeEmploiEnum;
import com.kodiatech.kodiatech.models.Utilisateur;
import com.kodiatech.kodiatech.services.ExperienceService;
import com.kodiatech.kodiatech.services.FormationService;
import com.kodiatech.kodiatech.services.UtilisateurService;

import javax.annotation.PostConstruct;
import java.util.Date;

@Component
@Transactional
public class DataLoader implements ApplicationRunner {
	private Utilisateur utilThom;
	private Utilisateur utilEd;
	private Utilisateur utilKaren;
	private Utilisateur utilJulien;

	private Adresse adresse;

	private Experience e1;
	private Experience e2;

	private Formation f1;
	private Formation f2;

	private FormationService formationService;
	private UtilisateurService utilisateurService;
	private ExperienceService experienceService;



	public DataLoader(FormationService formationService, UtilisateurService utilisateurService, ExperienceService experienceService) {
		this.formationService = formationService;
		this.utilisateurService = utilisateurService;
		this.experienceService = experienceService;
	}


	/**
	 * implemented method
	 *
	 * @param args
	 * @throws Exception
	 */
	@Override
	public void run(ApplicationArguments args) {
		initUtilisateurs();
		initFormations();
		initExperiences();


	}

	/**
	 * @PostConstruct car il y a run
	 */
	public void initUtilisateurs() {
		adresse =new Adresse(77,"Chemin Salade Ponsan", "31400", "Toulouse");
		utilThom = new Utilisateur("Thom", "Yorke","06-96-77-88", "thom@rh.com",adresse);

		utilEd = new Utilisateur("Ed", "Obrien", "06-96-77-88", "thom@rh.com",adresse);

		utilKaren = new Utilisateur("Karen", "Orzolek","06-96-77-88", "thom@rh.com",adresse);

		utilJulien = new Utilisateur("Julian", "Casablancas","06-96-77-88", "thom@rh.com",adresse);


	}

	/**
	 * @PostConstruct car y a run
	 */
	public void initFormations() {
		f1 = new Formation( new Date(2020, 11, 01),new Date(2021,11,01),"Informatique","Informatique","Informatique big data","UPS",utilThom);
		formationService.saveFormation(f1);
		

	}

	public Utilisateur getThom() {
		return utilThom;
	}

	public Utilisateur getEd() {
		return utilEd;
	}

	public Utilisateur getKaren() {
		return utilKaren;
	}

	public Utilisateur getJulian() {
		return utilJulien;
	}

	/**
	 * Clean Code ?
	 */
	public void initExperiences() {
			e1 = new Experience("Developpeur",TypeEmploiEnum.CDI,"Toulouse","BL","Develop web", true,
					new Date(),null,utilThom);
		experienceService.saveExperience(e1);
		

	}


}
