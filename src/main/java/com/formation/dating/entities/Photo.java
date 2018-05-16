package com.formation.dating.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Photo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_photo;
	private String lien;
	private Integer note;
}
