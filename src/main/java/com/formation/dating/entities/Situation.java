package com.formation.dating.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Situation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_situation;
	private String statuPro;
	private String statuPerso;
	private Integer nbrEnfant;
	private String orientation;
	private String fumeur;
	private String alcool;
}
