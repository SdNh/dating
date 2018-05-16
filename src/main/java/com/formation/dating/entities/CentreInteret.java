package com.formation.dating.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CentreInteret {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_ci;
	private String sport;
	private String loisir;
}
