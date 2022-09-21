package com.ipartek.laura.ejerciciosbasicos;

import java.util.Scanner;

public class Cuenta {

	private String nombre;
	private String numeroCuenta;
	private Double tipoInteres;
	private Double saldo;

	public Cuenta() {
		super();
	}

	public Cuenta(Cuenta c) {
		this.nombre = c.nombre;
		this.numeroCuenta = c.numeroCuenta;
		this.saldo = c.saldo;
		this.tipoInteres = c.tipoInteres;
	}

	public Cuenta(String nombre, String numeroCuenta, Double tipoIinteres, Double saldo) {
		super();
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoIinteres;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(Double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public boolean ingreso(Double cantidad) {
		boolean ingreso = true;
		if (cantidad < 0) {
			
		} else {
			this.saldo += cantidad;
		}
		return ingreso;
	}

	public boolean reintegro(Double cantidad) {
		boolean quitar = true;
		if (cantidad < 0) {
			quitar = false;
		} else {
			this.saldo -= cantidad;
		}
		return quitar;
	}

	public boolean transferencia(Cuenta cuenta, Double importe) {
		boolean transferir = true;
		if(importe < 1) {
			transferir = false;
		} else {
			this.reintegro(importe);
			cuenta.ingreso(importe);
		}
		return transferir;	
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nombre, numero;
		double tipo, importe;

		// se crea objeto cuenta1 sin parámetros
		// se ejecuta el constructor por defecto
		Cuenta cuenta1 = new Cuenta();

		System.out.print("Nombre : ");
		nombre = sc.nextLine();
		System.out.print("Número de cuenta : ");
		numero = sc.nextLine();
		System.out.print("Tipo de interes : ");
		tipo = sc.nextDouble();
		System.out.print("Saldo: ");
		importe = sc.nextDouble();

		cuenta1.setNombre(nombre);
		cuenta1.setNumeroCuenta(numero);
		cuenta1.setTipoInteres(tipo);
		cuenta1.setSaldo(importe);

		// se crea el objeto cuenta2 con los valores leidos por teclado
		// se ejecuta el constructor con parámetros
		Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300.5);

		// se crea cuenta3 como copia de cuenta1
		// se ejecuta el constructor copia
		Cuenta cuenta3 = new Cuenta(cuenta1);

		// mostrar los datos de cuenta1
		System.out.println("Datos de la cuenta 1");
		System.out.println("Nombre del titular: " + cuenta1.getNombre());
		System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
		System.out.println("Saldo: " + cuenta1.getSaldo());
		System.out.println();

		// se realiza un ingreso en cuenta1
		cuenta1.ingreso(4000.5);

		// mostrar el saldo de cuenta1 después del ingreso
		System.out.println("Saldo: " + cuenta1.getSaldo());

		// mostrar los datos de cuenta2
		System.out.println("Datos de la cuenta 2");
		System.out.println("Nombre del titular: " + cuenta2.getNombre());
		System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta2.getTipoInteres());
		System.out.println("Saldo: " + cuenta2.getSaldo());
		System.out.println();

		// mostrar los datos de cuenta3
		System.out.println("Datos de la cuenta 3");
		System.out.println("Nombre del titular: " + cuenta3.getNombre());
		System.out.println("Número de cuenta: " + cuenta3.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta3.getTipoInteres());
		System.out.println("Saldo: " + cuenta3.getSaldo());
		System.out.println();

		// realizar una transferencia de 10€ desde cuenta3 a cuenta2
		cuenta3.transferencia(cuenta2, 10.6);

		// mostrar el saldo de cuenta2
		System.out.println("Saldo de la cuenta 2");
		System.out.println("Saldo: " + cuenta2.getSaldo());
		System.out.println();

		// mostrar el saldo de cuenta3
		System.out.println("Saldo de la cuenta 3");
		System.out.println("Saldo: " + cuenta3.getSaldo());
		System.out.println();
	}

}
