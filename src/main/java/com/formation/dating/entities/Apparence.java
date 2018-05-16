package com.formation.dating.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Apparence {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_apparence;
	private Integer taille;
	private String couleurYeux;
	private String origine;
	private String couleurCheveux;
	private String typeCheveux;
	private Float masse;
}
