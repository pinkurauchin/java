package com.ipartek.laura.ejerciciosbasicos;

import java.util.Scanner;

public class Contador {

	private int cont;

	public Contador() {
		super();
	}

	public Contador(int cont) {
		super();
		if (this.cont < 0) {
			this.cont = 0;
		} else {
			this.cont = cont;
		}
	}

	public Contador(Contador c) {
		this.cont = c.cont;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		if (this.cont < 0) {
			this.cont = 0;
		} else {
			this.cont = cont;
		}
	}

	public void incrementar() {
		this.cont++;
	}

	public void decrementar() {
		this.cont--;
		if (this.cont < 0) {
			this.cont = 0;
		}
	}
	
	
	public static void main(String[] args) {
	       
        Scanner sc = new Scanner(System.in);
       
        //Utilizar el constructor por defecto
        Contador contador1 = new Contador();
      
        int n;
        System.out.println("Introduce valor para inicializar el contador: ");                                     
        n = sc.nextInt();
       
        //asignar un valor al contador
        contador1.setCont(n);
        //incrementar el contador
        contador1.incrementar();
        //mostrar el valor actual
        System.out.println(contador1.getCont());
       
        contador1.incrementar();
        contador1.incrementar();
       
        //mostrar el valor actual
        System.out.println(contador1.getCont());
       
        //restar 1 al valor del contador
        contador1.decrementar();
       
        //mostrar el valor actual
        System.out.println(contador1.getCont());

        //crear un nuevo objeto Contador con valor inicial 10
        Contador contador2 = new Contador(10);
       
        //incrementar y decrementar el contador2 y mostrar su valor                                               
        contador2.incrementar();
        System.out.println(contador2.getCont());
        contador2.decrementar();
        System.out.println(contador2.getCont());

        //crear un objeto Contador utilizando el constructor copia
        //se crea el objeto contador3 como copia de contador2
        Contador contador3 = new Contador(contador2);

        //mostrar el valor de contador3
        System.out.println(contador3.getCont());

}//Ejercicio básico POO Java. Clase principal

	/*public static void main(String[] args) {
		// Creacion del primer contador.
		Contador c1 = new Contador();
		c1.cont = 10;

		// Creacion del segundo contador.
		Contador c2 = new Contador(c1);
		// Al segundo contador le incrementamos.
		c2.incrementar();

		// Printeamos.
		System.out.println("Contador 1:" + c1.cont);
		System.out.println("Contador 2:" + c2.cont);
		System.out.println();

		// Restamos al contador 1.
		for (int i = 0; i < 11; i++) {
			c1.decrementar();
			System.out.println("Contador 1:" + c1.cont);
		}

		System.out.println();

		// Incrementamos al contador 1
		for (int i = 0; i < 11; i++) {
			c1.incrementar();
			System.out.println("Contador 1:" + c1.cont);
		}
	}*/

}
