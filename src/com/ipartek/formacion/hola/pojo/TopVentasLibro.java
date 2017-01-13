package com.ipartek.formacion.hola.pojo;

public class TopVentasLibro {

	static Libro[] aLibros = { new Libro("AMOR Y ASCO", 23, "SRTABEBI"),
			new Libro("ANIMALES FANTASTICOS Y DONDE ENCONTRARLOS", 566, "J.K. ROWLING"),
			new Libro("EL LABERINTO DE LOS ESPIRITUS", 351, "CARLOS RUIZ ZAFON"),
			new Libro("CUANDO ABRAS EL PARACAIDAS", 123, "JOSE. A. GOMEZ IGLESIAS"),
			new Libro("TODO ESTO TE DARE", 96, "DOLORES REDONDO") };

	public static void main(String[] args) {
		System.out.println("Top Ventas");
		imprimirLibros();

	}

	private static void imprimirLibros() {
		for (int i = 0; i < aLibros.length; i++) {
			System.out.println(i + 1 + aLibros[i].toString());
		}

	}

}
