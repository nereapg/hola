package com.ipartek.formacion.hola;

public class Dado {

	final static int NUM_MAX_ALUMNOS = 15;
	static String alumnoAfortunado;

	static String[] aAlumnos = { "Aaron", "Eneko", "Itsaso", "Ivan", "Guillermo", "Lozoya", "Josu", "Ignacio", "Gomez",
			"Nerea", "Nagore", "Garbiñe", "Egoitz", "Pavel", "Pérez" };

	public static void listar() {

		String alumno = "";
		for (int i = 0; i < aAlumnos.length; i++) {
			alumno = aAlumnos[i];
			System.out.println(i + " - " + aAlumnos[i]);
		}
	}

	public static void listarForEach() {
		for (String alumno : aAlumnos) {
			System.out.println(alumno);

		}
	}

	public static void main(String[] args) {

		int numeroAleatorio = Utilidades.getNumeroAleatorio((aAlumnos.length - 1));
		String afortunado = aAlumnos[numeroAleatorio];

		System.out.println(" El afortunado es: " + afortunado);

		System.out.println("-----------LISTADO------------");
		listar();
		
		//Bubble sort
		int aDesordenado[] = new int[] { 3, 0, 1, 8, 7, 2, 5, 4, 6, 9 };

		System.out.println("Array antes de Bubble Sort");
		for (int i = 0; i < aDesordenado.length; i++) {
			System.out.print(aDesordenado[i] + " ");
		}

		bubbleSort(aDesordenado);

		System.out.println("");

		// imprimir array despues de ordenar
		System.out.println("Array despues de Bubble Sort");
		for (int i = 0; i < aDesordenado.length; i++) {
			

	}

}
