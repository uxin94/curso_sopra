package com.sopra.spring.ejerciciopeliculasrestjpa.model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sopra.spring.ejerciciopeliculasrestjpa.model.entities.Pelicula;


public interface AlmacenDePeliculas extends JpaRepository<Pelicula, Integer>{

}
