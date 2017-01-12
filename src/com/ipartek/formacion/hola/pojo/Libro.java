package com.ipartek.formacion.hola.pojo;

/**
 * Clase {@code Libro} para representar un Libro.
 *
 */
public class Libro {

	// Atributos
	/**
	 * numero de paginas que contiene el {@code Libro}
	 */
	public int numeroPaginas;

	/**
	 * nombre del {@code Libro}
	 */
	public String nombre;
	/**
	 * autor del {@code Libro}
	 */
	public String autor;

	// Metodos o funciones
	/**
	 * Muestra por pantalla los atributos del {@code Libro}
	 */
	public String describete() {
		return "Descripción: " + this.nombre + " paginas: " + this.numeroPaginas + " autor: " + this.autor;
	}

	/**
	 * Aumentamos el numero de paginas
	 * 
	 * @param numPaginas
	 *            <code>int</code> numero de paginas nuevas escritas
	 */
	public void escribir(int numPaginas) {
		// this.numeroPaginas = this.numeroPagina + numPaginas
		this.numeroPaginas += numPaginas;
	}
}
