package com.formation.dating.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utlisateur {

	@Id
	private String emailUtilisateur;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private String sexe;
	private String motDePasse;
	private String description;
	private String pseudo;
	private String numeroTel;
	private Integer type;
	
}
