package proyecto1.model;

import java.io.Serializable;

public class Mensaje implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String mensaje;
	
	
	
	public Mensaje() {
		
	}
	public Mensaje(String nombre, String apellido, String email, String telefono, String mensaje) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.mensaje = mensaje;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
