package com.sopra.videoclub.ejercicioPelliculasDao;

import java.util.List;

import com.sopra.videoclub.ejercicioPeliculasModelo.Pelicula;

public interface IPeliculaDao {
	
	void create(Pelicula pelicula);

	List<Pelicula> read();

	Pelicula update(Pelicula pelicula);
	
	List<Pelicula> delete(Integer identificador);

	Pelicula readById(Integer identificador);
	
}