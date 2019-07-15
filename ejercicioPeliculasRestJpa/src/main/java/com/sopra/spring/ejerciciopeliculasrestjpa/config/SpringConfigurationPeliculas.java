package com.sopra.spring.ejerciciopeliculasrestjpa.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sopra.spring.ejerciciopeliculasrestjpa.model.AlmacenDePeliculas;
import com.sopra.spring.ejerciciopeliculasrestjpa.model.entities.Pelicula;

@Configuration // permite crear beans sin necesitar el .xml
public class SpringConfigurationPeliculas {

	@Bean
	public CommandLineRunner iniciarBaseDeDatos(AlmacenDePeliculas almacen){
		return args -> {
			
			almacen.save(new Pelicula("titulo1", "director1"));
			almacen.save(new Pelicula("titulo2", "director2"));
			almacen.save(new Pelicula("titulo3", "director3"));
		};
		
	}
	
}
