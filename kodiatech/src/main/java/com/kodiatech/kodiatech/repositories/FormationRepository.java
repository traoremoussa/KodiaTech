package com.kodiatech.kodiatech.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodiatech.kodiatech.models.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long>{
	public List<Formation> findAllByUtilisateur_id(long id);
	
	// List<Formation> findAllByUtilisateur_idIsNull(long id);
	
}
