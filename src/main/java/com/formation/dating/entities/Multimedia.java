package com.formation.dating.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Multimedia {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_multimedia;
	private String typeMultimedia;
	private String genre;
	private String titre;
	private String artiste;
}
