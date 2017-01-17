package com.ipartek.formacion.hola.pojo;

public class Libro {

	// atributos y constantes
	public String titulo;
	public String autor;
	public int numeroPaginas;

	/*
	 * constructores
	 * 
	 * Sirven para instanciar o crear objetos de la clase <br> Tienen el mismo
	 * nombre que la clase No hace falta especificar el <code>return</code>
	 * 
	 * sobrecarga: es un metodo con el mismo nombre y mismo return, <br> pero
	 * diferentes parametros
	 */

	// constructor por defecto
	public Libro() {
		super();
		this.numeroPaginas = 0;
		this.titulo = "desconocido";
		this.autor = "anonimo";
	}

	// constructor con parametros
	public Libro(String titulo, int numeroPaginas, String autor) {
		super();
		this.setNumeroPaginas(numeroPaginas);
		this.titulo = titulo;
		this.autor = autor;
	}

	// getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	/**
	 * En caso de ser negativo seteamos a 0
	 * 
	 * @param numeroPaginas
	 */
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = (numeroPaginas < 0) ? 0 : numeroPaginas;
	}

	// otros metodos

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + "]";
	}

}
