package com.sopra.web.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sopra.videoclub.ejercicioPeliculasModelo.Categorias;

@Controller
@Scope("request")
public class PeliculasMvc {
	
	@RequestMapping("darDeAlta")
	public ModelAndView verFormulario() {
		return new ModelAndView("formularioPelicula"); // nombre del .jsp!
	}

	
	@RequestMapping("mostrarPeliculas")
	public ModelAndView mostrarPeliculas(@RequestParam("titulo") String titulo, @RequestParam("director") String director, @RequestParam("sinopsis") String sinopsis) {
		this.peli.setNombre(nombre);
		this.droja.setTipo(tipo);
		ModelAndView modelAndView = new ModelAndView("muestraDroja"); // nombre del .jsp!!
		modelAndView.addObject("droja", this.droja);
		return modelAndView;
	}
	
	

}
