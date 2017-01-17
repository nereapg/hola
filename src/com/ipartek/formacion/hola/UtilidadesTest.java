package com.ipartek.formacion.hola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilidadesTest {

	@Test
	public void testGetNumeroAleatorio() {
		int numero = -1;
		final int NUMERO_MAXIMO = 10;

		// crear array con todo false
		boolean[] aResultado = new boolean[NUMERO_MAXIMO];

		// generar 1000 numero aleatorios y actualizar array con true
		for (int i = 0; i < 1000; i++) {
			numero = Utilidades.getNumeroAleatorio(NUMERO_MAXIMO);
			aResultado[numero] = true;
		}
		// recorrer array y comprobar todo true
		for (int i = 0; i < aResultado.length; i++) {
			assertTrue(aResultado[i]);
		}
	}

	@Test
	void testSumaTonta() {

		assertEquals("no suma bien", 5, Utilidades.sumaTonta(2, 3));
		assertEquals("num1 negativo, retorno 0", 0, Utilidades.sumaTonta(-2, 3));
		assertEquals("numeros negativos, retorno 0", 0, Utilidades.sumaTonta(-2, -3));
		assertEquals("num2 negativo, retorno 0", 0, Utilidades.sumaTonta(2, -3));
		assertEquals("suma mayor que 100, retorno 0", 0, Utilidades.sumaTonta(1, 100));

	}

	@Test
	public void testNoFallaNunca() {
		assertTrue(1 < 2);
	}
}
