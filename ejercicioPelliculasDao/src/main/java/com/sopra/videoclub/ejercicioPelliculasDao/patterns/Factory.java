package com.sopra.videoclub.ejercicioPelliculasDao.patterns;

import com.sopra.videoclub.ejercicioPelliculasDao.IPeliculaDao;
import com.sopra.videoclub.ejercicioPelliculasDao.PeliculasDaoImpl;

public class Factory {

	private static IPeliculaDao miPeliculaDao;
	
	public static IPeliculaDao getDaoDePelicula(){
		
//		if(miPeliculaDao == null) {
//			
//			PeliculasDaoImpl peliculasDaoImpl = new PeliculasDaoImpl();
//		}
		return miPeliculaDao;
	}
	
	
}