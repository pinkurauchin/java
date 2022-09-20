package com.ipartek.laura.ud1;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Lenguaje {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		// Version 1.0
		Date d = new Date();
		System.out.println(d.getDay() + " " + (d.getMonth() + 1) + " " + (d.getYear() + 1900));

		// Version 1.1
		Calendar c = new GregorianCalendar();
		System.out.println(c.get(Calendar.DATE));
		
	}

	public static void mainTiposBasicos(String[] args) {
		double d1 = 4.8;
		double d2 = 0.4;

		// long l = 12341231233L; usar la L para ser explicito.

		System.out.println(d1 - d2);

		String nombre1 = new String("Laura");
		String nombre2 = new String("Laura");

		// Compara la referencia, la instancia.
		System.out.println(nombre1 == nombre2);
		// Compara el valor.
		System.out.println(nombre1.equals(nombre2));

		// Métodos de la clase String
		System.out.println(nombre1.length());
		System.out.println(nombre1.toUpperCase());
		System.out.println(nombre1.indexOf("L"));
		System.out.println("Hola " + nombre1);

		// Los BigDecimal hay que pasarlos como string para que los transorme.
		BigDecimal bd1 = new BigDecimal("4.8");
		BigDecimal bd2 = new BigDecimal("0.4");

		System.out.println(bd1.subtract(bd2));

	}

}
