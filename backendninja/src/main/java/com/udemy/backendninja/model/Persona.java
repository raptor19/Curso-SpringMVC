package com.udemy.backendninja.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class Persona {
	
	@NonNull
	@Size(min=2, max=20)
	private String nombre;
	@NonNull
	@Size(min=2, max=20)
	private String apellido;
	@NonNull
	@Min(18)
	private int edad;
	
	public Persona() {
		super();
	}

	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	
}
