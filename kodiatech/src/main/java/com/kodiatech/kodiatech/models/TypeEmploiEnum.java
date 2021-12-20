package com.kodiatech.kodiatech.models;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** TODO
les enume doiven extend un abstract class
dans ce cas les liste d'enum seront labas , ..
sauf si necessaire des methodes à implementer differenment 
// va etre pour super(name)
*/

public enum TypeEmploiEnum {
	/**
	 * https://www.baeldung.com/java-enum-iteration
	 */

// va etre pour super(name)
	STAGE("Stage"),
	CDI("Temps plein"),
	CDD ("Temps partiel") ;

	private String nom;


	TypeEmploiEnum(String nom) {

		this.nom=nom;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public static Stream<TypeEmploiEnum> listEmploi(){
		Stream<TypeEmploiEnum>  emplois= Stream.of(TypeEmploiEnum.values());
		return emplois;
	}
	public static List<TypeEmploiEnum> listEmplois(){
		List  emplois= Stream.of(TypeEmploiEnum.values()).collect(Collectors.toList());
		return emplois;
	}
}
