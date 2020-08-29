package com.kodiatech.kodiatech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodiatech.kodiatech.models.Experience;
import com.kodiatech.kodiatech.repositories.ExperienceRepository;

@Service
public class ExperienceService {
	
	@Autowired
	ExperienceRepository experienceRepository;
	
	//save 
	public Experience saveExperience(Experience  experience) {
		return experienceRepository.save(experience);
	}
	
	//read
	public List<Experience> getExperiences(){
		return experienceRepository.findAll();
	}

}
