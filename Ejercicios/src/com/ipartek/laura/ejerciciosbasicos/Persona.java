package com.ipartek.laura.ejerciciosbasicos;

import java.time.LocalDate;
import java.util.Scanner;

public class Persona {

	private String nombre;
	private String direccion;
	private int codigoPostal;
	private String ciudad;
	private Fecha fechaNacimiento;

	public Persona() {
		super();
	}

	public Persona(String nombre, String direccion, int codigoPostal, String ciudad, Fecha fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.ciudad = ciudad;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public boolean esMayorDeEdad() {
		Fecha f = new Fecha(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(),
				LocalDate.now().getYear());

		return this.fechaNacimiento.esMayorQue(f);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: ");
		sb.append(nombre);
		sb.append("\nFecha de Nacimiento: ");
		sb.append(fechaNacimiento);
		sb.append("\nDireccion: ");
		sb.append(direccion);
		sb.append("\n");
		sb.append(codigoPostal);
		sb.append("\n");
		sb.append(ciudad);
		sb.append("\n");
		return sb.toString();
	}

}
