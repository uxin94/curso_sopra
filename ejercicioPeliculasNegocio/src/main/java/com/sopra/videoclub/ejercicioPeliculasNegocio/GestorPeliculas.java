package com.sopra.videoclub.ejercicioPeliculasNegocio;

import java.util.ArrayList;
import java.util.List;

import com.sopra.videoclub.ejercicioPeliculasModelo.Pelicula;
import com.sopra.videoclub.ejercicioPelliculasDao.IPeliculaDao;

public class GestorPeliculas {

	private IPeliculaDao miDaoDePeliculas;
	
	public Pelicula altaPelicula(List<Pelicula>) {
		
	}
	
	public List<Pelicula> listaPeliculas(){
		
		return new ArrayList<Pelicula>(miDaoDePeliculas.read());

	}
	
	public Pelicula updatePelicula(List<Pelicula>) {
		
		
	}
	
}
