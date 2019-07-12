package com.sopra.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.sopra.videoclub.ejercicioPeliculasNegocio.GestorPeliculas;

/**
 * Servlet implementation class ListarPeliculas
 */


@WebServlet("/listar")
public class ListarPeliculas extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //public static GestorPeliculas gestorDePeliculas = new GestorPeliculas(new PeliculasDaoImpl(new ArrayList<Pelicula>()));
	
	private ApplicationContext context;
	
	@Override
	public void init() throws ServletException {
		
		this.context = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
	}
	
	public static GestorPeliculas gestorDePeliculas;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
	

    public ListarPeliculas() {
        super();
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


