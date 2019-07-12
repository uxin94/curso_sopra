package com.sopra.web.controllers;

import static com.sopra.videoclub.ejercicioPeliculasModelo.Categorias.COMEDIA;
import static com.sopra.videoclub.ejercicioPeliculasModelo.Categorias.DRAMA;
import static com.sopra.videoclub.ejercicioPeliculasModelo.Categorias.SCIFI;
import static com.sopra.videoclub.ejercicioPeliculasModelo.Categorias.TERROR;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;

import com.sopra.videoclub.ejercicioPeliculasModelo.Categorias;
import com.sopra.videoclub.ejercicioPeliculasModelo.Pelicula;
import com.sopra.videoclub.ejercicioPeliculasNegocio.GestorPeliculas;
import com.sopra.videoclub.ejercicioPelliculasDao.PeliculasDaoImpl;

/**
 * Servlet implementation class ListarPeliculas
 */


@WebServlet("/listar")
public class ListarPeliculas extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //public static GestorPeliculas gestorDePeliculas = new GestorPeliculas(new PeliculasDaoImpl(new ArrayList<Pelicula>()));
	
	private ApplicationContext context;
	public static GestorPeliculas gestorDePeliculas;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public ListarPeliculas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		gestorDePeliculas = context.getBean(GestorPeliculas.class);
		String lista = DarDeAlta.gestorDePeliculas.listaPeliculas().toString();
		request.setAttribute("listaDePelis", lista);
		getServletContext().getRequestDispatcher("/WEB-INF/jsps/listar.jsp").forward(request, response);
	}


}


