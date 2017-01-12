package com.ipartek.formacion.hola;

public class Dado {

	static String[] aAlumnos = { "Aaron", "Eneko", "Itsaso", "Ivan", "Guillermo", "Josu", "Ignacio", "Gomez", "Nerea",
			"Nagore", "Garbiñe" };

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

	}

}
