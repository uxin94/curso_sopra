package com.sopra.videoclub.ejercicioPelliculasDao;

import java.util.ArrayList;
import java.util.List;

import com.sopra.videoclub.ejercicioPeliculasModelo.Pelicula;

public class PeliculasDaoImpl implements IPeliculaDao {
	
	private List<Pelicula> miListaDePeliculas = new ArrayList<Pelicula>();
	
	public PeliculasDaoImpl(List<Pelicula> miListaDePeliculas) {
		super();
		this.miListaDePeliculas = miListaDePeliculas;
	}

	
	
	public void create(Pelicula pelicula) {

		if(!miListaDePeliculas.contains(pelicula)) {
			miListaDePeliculas.add(pelicula);
		}
		
	}

	public Pelicula update(Pelicula pelicula) {
		if(miListaDePeliculas.remove(pelicula)) {
			miListaDePeliculas.add(pelicula);
		}
		return pelicula;
	}

	public List<Pelicula> delete(Integer identificador) {
		for(int i = 0; i<miListaDePeliculas.size(); i++) {
			if (miListaDePeliculas.get(i).getIdentificador().equals(identificador)) {
				miListaDePeliculas.remove(i);
			}
		}
		return miListaDePeliculas;
	}


	public List<Pelicula> read() {
		
		return miListaDePeliculas;
	}

	public Pelicula readById(Integer identificador) {
		
		Pelicula pelicula = null;
		for(int i = 0; i<miListaDePeliculas.size() || pelicula == null ;i++) {
			if (miListaDePeliculas.get(i).getIdentificador().equals(identificador)) {
				pelicula =  miListaDePeliculas.get(i);
			}
		}
		return pelicula;
	}

	

	
	
	
	
	
	
}
