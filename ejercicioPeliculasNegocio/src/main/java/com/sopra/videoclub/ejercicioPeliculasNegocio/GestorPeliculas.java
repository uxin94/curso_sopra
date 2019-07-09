package com.sopra.videoclub.ejercicioPeliculasNegocio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sopra.videoclub.ejercicioPeliculasModelo.Pelicula;
import com.sopra.videoclub.ejercicioPelliculasDao.IPeliculaDao;

@Service
public class GestorPeliculas {

	@Autowired
	private IPeliculaDao peliculaDao;
	
	public GestorPeliculas(IPeliculaDao peliculaDao) {
		super();
		this.peliculaDao = peliculaDao;
	}


	public Pelicula altaPelicula(List<Pelicula> listaDePeliculas) {
		
		for(int i=0; i < listaDePeliculas.size(); i++) {
			
			peliculaDao.create(listaDePeliculas.get(i));
		}
		return null;
	}
	
	
	public List<Pelicula> listaPeliculas(){
		
		return new ArrayList<Pelicula>(peliculaDao.read());
	}
	
	public Pelicula updatePelicula(List<Pelicula> listaDePeliculas) {
		
		for(int i=0; i < listaDePeliculas.size(); i++) {
			
			peliculaDao.update(listaDePeliculas.get(i));
		}
		
		return null;
	}
	
	
	public void deletePelicula(List<Pelicula> listaDePeliculas) {
		
		for(int i=0; i < listaDePeliculas.size(); i++) {

			peliculaDao.delete(listaDePeliculas.get(i).getIdentificador());
		}
	}
	
	
}
