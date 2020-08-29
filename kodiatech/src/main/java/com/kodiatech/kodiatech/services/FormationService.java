package com.kodiatech.kodiatech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodiatech.kodiatech.models.Formation;
import com.kodiatech.kodiatech.repositories.FormationRepository;

@Service
public class FormationService {

	@Autowired
	FormationRepository formationRepository;

	//save
	public Formation saveFormation(Formation formation) {
		return formationRepository.save(formation);
	} 
	// read
	public List<Formation> getFormations(){
		return formationRepository.findAll();

	}
	// read by utilisateur
	public List<Formation> getFormationsByUtilisateur(long id){
		return formationRepository.findAllByUtilisateur_id(id);

	}
}
