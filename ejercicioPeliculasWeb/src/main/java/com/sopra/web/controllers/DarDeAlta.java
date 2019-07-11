package com.sopra.web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sopra.videoclub.ejercicioPeliculasModelo.Categorias;
import com.sopra.videoclub.ejercicioPeliculasModelo.Pelicula;
import com.sopra.videoclub.ejercicioPeliculasNegocio.GestorPeliculas;
import com.sopra.videoclub.ejercicioPelliculasDao.PeliculasDaoImpl;

/**
 * Servlet implementation class DarDeAlta
 */


@WebServlet("/alta")
public class DarDeAlta extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static List<Pelicula> listaDePeliculas = new ArrayList<Pelicula>();   
    public static GestorPeliculas gestorDePeliculas = new GestorPeliculas(new PeliculasDaoImpl(listaDePeliculas));
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    
    public DarDeAlta() {
        super();
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Pelicula pelicula = new Pelicula(request.getParameter("titulo"), request.getParameter("director"), request.getParameter("sinopsis"), devolverListaDeCategoriasDesdeString(request.getParameter("cat")));
		listaDePeliculas.add(pelicula);
		gestorDePeliculas.altaPelicula(listaDePeliculas);
		getServletContext().getRequestDispatcher("/WEB-INF/jsps/alta.jsp").forward(request, response);
	}


	private List<Categorias> devolverListaDeCategoriasDesdeString(String stringDeCategorias) {

		// Despiezar el string en categorias en texto
		String[] arrayDecategoriasEnTexto = stringDeCategorias.split(",");
		List<Categorias> categoriasDeLaPelicula = new ArrayList<Categorias>();
		
		// Comparar cada palabra con un enum y sacar el valor		
		for (int i=0; i<arrayDecategoriasEnTexto.length; i++) {
			try {
				Categorias categoria = Categorias.valueOf(arrayDecategoriasEnTexto[i].toUpperCase());
				categoriasDeLaPelicula.add(categoria);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
		
		return categoriasDeLaPelicula; //Arrays.asList(COMEDIA,DRAMA);
	}
}
