package com.mikeldi.demo.model;

public class Persona {
	private String nombre;
	private String apellidos;
	private String DNI;
	private int edad;
	
	public Persona() {
		
	}
	public Persona(String nombre, String apellidos, String dNI, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.DNI = dNI;
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getDNI() {
		return DNI;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setDNI(String dNI) {
		this.DNI = dNI;
	}
}
