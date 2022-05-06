package proyecto1.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import proyecto1.model.Mensaje;
import proyecto1.services.Utilidad;

/**
 * Servlet implementation class Proyecto1Controller
 */
@WebServlet("/Proyecto1Control")
public class Proyecto1Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Proyecto1Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: GET ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String mensaje = request.getParameter("mensaje");
		String email = request.getParameter("email");
		String telefono = request.getParameter("telefono");
		
		Mensaje m = new Mensaje();
		m.setApellido(apellido);
		m.setNombre(nombre);
		m.setMensaje(mensaje);
		m.setTelefono(telefono);
		m.setEmail(email);
		
		
		Utilidad.enviarCorreo(m);
		
		//request.getRequestDispatcher("/index.jsp").forward(request, response);
		
		response.sendRedirect("/index.jsp");
		
		//response.getWriter().append("Served at: POST " + nombre + " - ").append(request.getContextPath());
	}

}
