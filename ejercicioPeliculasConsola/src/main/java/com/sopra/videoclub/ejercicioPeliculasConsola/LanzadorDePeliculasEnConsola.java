package com.sopra.videoclub.ejercicioPeliculasConsola;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sopra.videoclub.ejercicioPeliculasModelo.Categorias;
import com.sopra.videoclub.ejercicioPeliculasModelo.Pelicula;
import com.sopra.videoclub.ejercicioPeliculasNegocio.GestorPeliculas;

public class main 
{
    public static void main( String[] args )
    {
            	
    	GestorPeliculas gestionPeliculas = new GestorPeliculas();
    	List<Pelicula> miListaDePeliculas = new ArrayList<Pelicula>(); 
    	
    	Pelicula pelicula1 = new Pelicula("tit1","dir1","sinop1", Arrays.asList(Categorias.Comedia,Categorias.Drama));
    	miListaDePeliculas.add(pelicula1);
    	Pelicula pelicula2 = new Pelicula("tit2","dir2","sinop2", Arrays.asList(Categorias.Terror,Categorias.SciFi));
    	miListaDePeliculas.add(pelicula2);
    	Pelicula pelicula3 = new Pelicula("tit3","dir3","sinop3", Arrays.asList(Categorias.Terror,Categorias.Comedia));
    	miListaDePeliculas.add(pelicula3);
    	Pelicula pelicula4 = new Pelicula("tit4","dir4","sinop4", Arrays.asList(Categorias.Drama,Categorias.SciFi));
    	miListaDePeliculas.add(pelicula4);
    	Pelicula pelicula5 = new Pelicula("tit5","dir5","sinop5", Arrays.asList(Categorias.Terror,Categorias.SciFi));
    	miListaDePeliculas.add(pelicula5);
    	Pelicula pelicula6 = new Pelicula("tit6","dir6","sinop6", Arrays.asList(Categorias.Comedia,Categorias.Drama));
    	miListaDePeliculas.add(pelicula6);
    	Pelicula pelicula7 = new Pelicula("tit7","dir7","sinop7", Arrays.asList(Categorias.Comedia,Categorias.SciFi));
    	miListaDePeliculas.add(pelicula7);
    	Pelicula pelicula8 = new Pelicula("tit8","dir8","sinop8", Arrays.asList(Categorias.Comedia,Categorias.Drama));
    	miListaDePeliculas.add(pelicula8);
    	Pelicula pelicula9 = new Pelicula("tit9","dir9","sinop9", Arrays.asList(Categorias.Terror,Categorias.SciFi));
    	miListaDePeliculas.add(pelicula9);
    	Pelicula pelicula10 = new Pelicula("tit10","dir10","sinop10",Arrays.asList(Categorias.Terror,Categorias.SciFi));
    	miListaDePeliculas.add(pelicula10);
    	
    	
    	gestionPeliculas.altaPelicula(miListaDePeliculas);
    	System.out.println(gestionPeliculas.listaPeliculas());

    	List<Pelicula> peliculasAActualizar = new ArrayList<Pelicula>();
    	pelicula3.setTitulo("nuevotitulo3");
    	pelicula2.setTitulo("nuevotitulo2");
    	peliculasAActualizar.add(pelicula3);
    	peliculasAActualizar.add(pelicula2);
    	gestionPeliculas.updatePelicula(peliculasAActualizar);
    	System.out.println(gestionPeliculas.listaPeliculas());
    	    	
    	List<Pelicula> peliculasAEliminar = new ArrayList<Pelicula>();
    	peliculasAEliminar.add(pelicula1);
    	gestionPeliculas.deletePelicula(peliculasAEliminar);
    	System.out.println(gestionPeliculas.listaPeliculas());
    	

    }
}
