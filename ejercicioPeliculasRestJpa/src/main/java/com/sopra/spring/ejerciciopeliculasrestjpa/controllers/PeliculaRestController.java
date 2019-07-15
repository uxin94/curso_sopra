package com.sopra.spring.ejerciciopeliculasrestjpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.spring.ejerciciopeliculasrestjpa.model.AlmacenDePeliculas;
import com.sopra.spring.ejerciciopeliculasrestjpa.model.entities.Pelicula;

@RestController
public class PeliculaRestController {

	@Autowired
	public AlmacenDePeliculas almacen;


	public AlmacenDePeliculas getAlmacen() {
		return almacen;
	}

	public void setAlmacen(AlmacenDePeliculas almacen) {
		this.almacen = almacen;
	}
	

	@GetMapping("/peliculas")
	public List<Pelicula> peliculas(){
		
		return almacen.findAll();
	}
	
	@GetMapping("/peliculas/{identificador}")  
	public Pelicula pelicula(@PathVariable Integer id) {
		
		return almacen.findById(id).orElse(null);
	}
	
	@PostMapping("/peliculas")
	public Pelicula darDeAltaPelicula(@RequestBody Pelicula pelicula) {
		return almacen.save(pelicula);
	}

	@PutMapping("/peliculas/{identificador}")
	public Pelicula actualizarPelicula(@RequestBody Pelicula pelicula, @PathVariable Integer id) {
		return almacen.findById(id).map(clienteEncontrado -> {
			clienteEncontrado.setTitulo(pelicula.getTitulo()); 
			clienteEncontrado.setDirector(pelicula.getDirector());
			return almacen.save(clienteEncontrado);
		}).orElseGet(()->{
			pelicula.setIdentificador(id);
			return almacen.save(pelicula);
			});
	}
	
	@DeleteMapping("/peliculas/{identificador}")
	public void borrarPelicula(@PathVariable Integer id) { 
		almacen.deleteById(id);
	}

}


