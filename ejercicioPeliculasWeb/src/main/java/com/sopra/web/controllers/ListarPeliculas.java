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
    public static List<Pelicula> listaDePeliculas = new ArrayList<Pelicula>();   
    public static GestorPeliculas gestorDePeliculas = new GestorPeliculas(new PeliculasDaoImpl(listaDePeliculas));
       
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
		

		gestorDePeliculas.listaPeliculas();
		getServletContext().getRequestDispatcher("/WEB-INF/jsps/listar.jsp").forward(request, response);
	}


}


