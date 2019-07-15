package com.sopra.spring.ejerciciopeliculasrestjpa.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer identificador;
	private String titulo;
	private String director;
	
	public Pelicula() {
		super();
	}
	
	public Pelicula(String titulo, String director) {
		super();
		this.titulo = titulo;
		this.director = director;
	}
	
	public Integer getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}



}
