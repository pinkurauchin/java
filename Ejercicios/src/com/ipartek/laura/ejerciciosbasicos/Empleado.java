package com.ipartek.laura.ejerciciosbasicos;

public class Empleado {

	private String nif;
	private String nombre;
	private Double sueldoBase;
	private Integer horasExtras;
	private Double tipoIrpf;
	private char casado;
	private Integer numeroHijos;

	private static double horaExtraPago;

	public Empleado() {
		super();
	}

	public Empleado(String nif) {
		super();
		this.nif = nif;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(Double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public Integer getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(Integer horasExtras) {
		this.horasExtras = horasExtras;
	}

	public Double getTipoIrpf() {
		return tipoIrpf;
	}

	public void setTipoIrpf(Double tipoIrpf) {
		this.tipoIrpf = tipoIrpf;
	}

	public char getCasado() {
		return casado;
	}

	public void setCasado(char casado) {
		this.casado = casado;
	}

	public Integer getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(Integer numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	public static double getHoraExtraPago() {
		return horaExtraPago;
	}

	public static void setHoraExtraPago(double horaExtraPago) {
		Empleado.horaExtraPago = horaExtraPago;
	}

	public Double complementoHorasExtras() {
		return this.horasExtras * this.complementoHorasExtras();
	}

	public Double sueldoBruto() {
		return this.sueldoBase + this.complementoHorasExtras();
	}

	public Double retencionesIrpf() {
		if (this.casado == 'S') {
			this.tipoIrpf -= 2;
		}
		this.tipoIrpf -= this.numeroHijos;

		return this.tipoIrpf;
	}

	@Override
	public String toString() {
		return 
			this.nif + " " + this.nombre + "/n" + 
			"Sueldo base: "	+ this.sueldoBase + "/n" +
			"Horas extras: " + this.horasExtras + "/n" +
			"Tipo IRPF: " + this.tipoIrpf + "/n" + 
			"Casado: " + this.casado + "/n" + 
			"Numero de hijos: " + this.numeroHijos ;
	}
	
}
