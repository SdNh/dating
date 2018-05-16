package com.formation.dating.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Adresse {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_adresse;
	@NotBlank
	@NotNull
	private Integer codePostal;
	@NotBlank
	@NotNull
	private String ville;
	@NotBlank
	@NotNull
	private Integer numero;
	@NotBlank
	@NotNull
	private String typeRue;
	@NotBlank
	@NotNull
	private String nomRue;
	@NotBlank
	@NotNull
    private String complement;
	@NotBlank
	@NotNull
    private String prefixe;
}