package com.kodiatech.kodiatech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kodiatech.kodiatech.models.Formation;
import com.kodiatech.kodiatech.services.FormationService;

@RestController
public class FormationController {

	@Autowired
	private FormationService formationService;


	@GetMapping("/formations")
	public List<Formation> getFormations(){
		return formationService.getFormations();	
	}
	@GetMapping("/formations/{id}")
	public List<Formation> getFormations(@PathVariable long id){
		return formationService.getFormationsByUtilisateur(id);	
	}
}
