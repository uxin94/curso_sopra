package com.sopra.web.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sopra.videoclub.ejercicioPeliculasModelo.Pelicula;
import com.sopra.videoclub.ejercicioPeliculasNegocio.GestorPeliculas;

@Controller
@Scope("request")
public class PeliculasMvc {
	
	@Autowired
	public GestorPeliculas gestor;
	
	@RequestMapping("alta")
	public ModelAndView verFormulario() {
		return new ModelAndView("formularioPelicula"); // nombre del .jsp!
	}

	
	@RequestMapping("mostrar")
	public ModelAndView mostrarPeliculas(@RequestParam("titulo") String titulo, @RequestParam("director") String director, @RequestParam("sinopsis") String sinopsis) {
		
		List<Pelicula> altaDePelis = new ArrayList<Pelicula>();

		Pelicula peli = new Pelicula(titulo, director, sinopsis);
		altaDePelis.add(peli);
		gestor.altaPelicula(altaDePelis);
		
		ModelAndView modelandView = new ModelAndView("listaDePeliculas"); 
		modelandView.addObject("listado", gestor.listaPeliculas()); // al .jsp le paso la lista de pelis que debe mostrar
		return modelandView;
	}
	
	

}
