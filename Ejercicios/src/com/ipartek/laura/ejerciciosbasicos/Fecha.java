package com.ipartek.laura.ejerciciosbasicos;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Fecha {

	private int dia;
	private int mes;
	private int año;

	public Fecha() {
		super();
	}

	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public boolean fechaCorrecta() {
		/*
		 * boolean correcta = true; try { esBisiesto(año); LocalDate today =
		 * LocalDate.of(this.año, this.mes, this.dia); } catch (DateTimeException ex) {
		 * correcta = false; } return correcta;
		 */

		boolean diaCorrecto, mesCorrecto, añoCorrecto;
		añoCorrecto = año > 0;
		mesCorrecto = mes >= 1 && mes <= 12;
		switch (mes) {
		case 2:
			if (esBisiesto(año)) {
				diaCorrecto = dia >= 1 && dia <= 29;
			} else {
				diaCorrecto = dia >= 1 && dia <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = dia >= 1 && dia <= 30;
			break;
		default:
			diaCorrecto = dia >= 1 && dia <= 31;
		}
		return diaCorrecto && mesCorrecto && añoCorrecto;

	}

	private boolean esBisiesto(int año) {
		GregorianCalendar c = new GregorianCalendar();
		boolean bisiesto = true;
		if (c.isLeapYear(año)) {
			bisiesto = false;
		}
		return bisiesto;
	}

	public void diaSiguiente() {
		dia++;
		if (!fechaCorrecta()) {
			dia = 1;
			mes++;
			if (!fechaCorrecta()) {
				mes = 1;
				año++;
			}

		}
	}

	public boolean esMayorQue(Fecha f) {
		boolean mayor = true;
		if (this.año > f.año) {
			mayor = false;
		} else if (this.año == f.año && this.mes > f.mes) {
			mayor = false;
		} else if (this.año == f.año && this.mes == f.mes && this.dia > f.dia) {
			mayor = false;
		}
		return mayor;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (dia < 10) {
			sb.append("0");
		}
		sb.append(dia);
		sb.append("-");
		if (mes < 10) {
			sb.append("0");
		}
		sb.append(mes);
		sb.append("-");
		sb.append(año);
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d, m, a;

		// Se pide por teclado el dia, mes y año
		System.out.println("Introduce fecha: ");
		System.out.print("dia: ");
		d = sc.nextInt();
		System.out.print("mes: ");
		m = sc.nextInt();
		System.out.print("año: ");
		a = sc.nextInt();

		// Se crea un objeto Fecha utilizando el consructor con parámetros
		Fecha fecha = new Fecha(d, m, a);

		if (fecha.fechaCorrecta()) { // si la fecha es correcta

			// Se muestra utilizando el método toString()
			System.out.println("Fecha introducida: " + fecha);

			// Se muestran los 10 días siguientes utilizando el método diaSiguiente()
			System.out.println("Los 10 días siguientes son:");
			for (int i = 1; i <= 10; i++) {
				fecha.diaSiguiente();
				System.out.println(fecha);
			}

		} else { // Si la fecha no es correcta
			System.out.println("Fecha no valida");
		}
	}
}
