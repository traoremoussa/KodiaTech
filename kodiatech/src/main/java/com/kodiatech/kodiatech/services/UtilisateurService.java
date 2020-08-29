package com.kodiatech.kodiatech.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodiatech.kodiatech.models.Utilisateur;
import com.kodiatech.kodiatech.repositories.UtilisateurRepository;
import com.sun.el.stream.Stream;

@Service
public class UtilisateurService {
	
	@Autowired
	UtilisateurRepository utilisateurRepository;
	
	//save / creat
	public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
		
	}
	//read
	public List<Utilisateur> getUtilisateurs(){
		List<Utilisateur> utilisateurs=new ArrayList<Utilisateur>();
		 utilisateurRepository.findAll().forEach(element -> utilisateurs.add(element));
		return utilisateurs;
	}

}
