package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LibroTest {

	@Test
	public void testConstructorPorDefecto() {

		Libro l = new Libro();
		assertEquals("desconocido", l.getTitulo());
		assertEquals("anonimo", l.getAutor());
		assertEquals(0, l.getNumeroPaginas());
	}

	@Test
	public void testConstructorConParametros() {

		Libro l = new Libro("Java 7", 324);
		assertEquals("Java 7", l.getTitulo());
		assertEquals("anonimo", l.getAutor());
		assertEquals(324, l.getNumeroPaginas());

		// paginas negativas
		l = new Libro("Java 7", -1);
		assertEquals("Java 7", l.getTitulo());
		assertEquals("anonimo", l.getAutor());
		assertEquals(0, l.getNumeroPaginas());
	}

	@Test
	public void testTitulo() {

		Libro libroJava = new Libro();

		// libroJava.titulo = "Java7";
		libroJava.setTitulo("Java 7");

		assertEquals("Java 7", libroJava.getTitulo());
	}

	@Test
	public void testNumeroPaginas() {

		Libro l = new Libro();

		// Numero paginas positivo
		l.setNumeroPaginas(300);
		assertEquals(300, l.getNumeroPaginas());

		// Numero paginas negativo
		l.setNumeroPaginas(-300);
		assertEquals(0, l.getNumeroPaginas());

	}

}
