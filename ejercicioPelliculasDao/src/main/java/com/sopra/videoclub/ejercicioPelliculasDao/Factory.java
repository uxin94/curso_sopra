package com.sopra.videoclub.ejercicioPelliculasDao;


public class Factory {

	private static IPeliculaDao miPeliculaDao;
	
	public static IPeliculaDao getDaoDePelicula(){
		
		if(miPeliculaDao == null) {
			
			miPeliculaDao = new PeliculasDaoImpl(new List<Pelicula>());
		}
		return miPeliculaDao;
	}
	
	
}
