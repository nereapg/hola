package com.ipartek.formacion.hola;

import com.ipartek.formacion.hola.pojo.LibroNoEncapsulado;

/**
 * clase para realizar un 'Hello world
 * 
 * @author curso
 *
 */
public class Hola {
	/**
	 * metodo 'main'para ejecutar la clase
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// operador ternario
		// asignar un valor a una variable en funcion de una condición
		// (condicion)? true : false
		int edad = (3 > 100) ? 18 : 34;
		System.out.println("edad: " + edad);

		// declarar variables
		int variableEntera;
		boolean variableBooleana = true;
		if (!variableBooleana) {
			System.out.println("Es verdadero");
		} else {
			System.out.println("Es falso");
		}
		float variableFloat = 10.23f;
		float variableFloat2 = (float) 10.23; // casteada
		char caracter = 'p';
		String cadena = "cadena";

		// comentario de linea

		/*
		 * comentario de bloque permite más de una linea
		 */

		System.out.println("Hello world");

		// instanciar un objeto de la clase Libro
		LibroNoEncapsulado libroJava = new LibroNoEncapsulado();
		libroJava.numeroPaginas = 320;
		libroJava.nombre = "Java 7";
		libroJava.autor = "Roberto Montero Miguel";

		System.out.println(libroJava.describete());

		System.out.println("Escribir 10 paginas nuevas");
		// for (int i = 0; i < 10; i++) {

		libroJava.escribir(10);
		// }
		System.out.println(libroJava.describete());

		LibroNoEncapsulado libroPHP = new LibroNoEncapsulado();
		libroPHP.numeroPaginas = 725;
		libroPHP.nombre = "PHP";
		libroPHP.autor = "Anonimo";
		System.out.println(libroPHP.describete());
		libroPHP.escribir(20);
		System.out.println(libroPHP.describete());

	}
}
