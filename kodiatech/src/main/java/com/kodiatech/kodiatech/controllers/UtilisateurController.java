package com.kodiatech.kodiatech.controllers;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodiatech.kodiatech.models.TypeEmploiEnum;
import com.kodiatech.kodiatech.models.Utilisateur;
import com.kodiatech.kodiatech.services.UtilisateurService;

@RestController
public class UtilisateurController {
	
	@Autowired
	private UtilisateurService utilisateurService;
	
	@GetMapping("/")
	public List<String> hello() {
		return TypeEmploiEnum.listEmploi().map(x->x.getNom()).collect(Collectors.toList());//" I come so soon";
	}
	
	
	@GetMapping("/utilisateurs")
	public ResponseEntity<List<Utilisateur>> getUtilisateurs(){
		return new ResponseEntity<List<Utilisateur>>(utilisateurService.getUtilisateurs(), HttpStatus.OK);
	}

	
	@PostMapping("")
	public ResponseEntity<Utilisateur> saveUtilisateurs(@Valid @RequestBody Utilisateur utilisateur){
		Utilisateur util=utilisateurService.saveUtilisateur(utilisateur);
		return new ResponseEntity<Utilisateur>(util,HttpStatus.CREATED);
	}
	
}
