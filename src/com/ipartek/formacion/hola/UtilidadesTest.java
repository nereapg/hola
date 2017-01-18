package com.ipartek.formacion.hola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilidadesTest {

	@Test
	public void testBubbleSort() {
		int[] aDesordenado = { 3, 0, 1, 8, 7, 2, 5, 4, 6, 9 };
		int[] aOrdenado = Utilidades.bubbleSort(aDesordenado);

		assertEquals(0, aOrdenado[0]);
		assertEquals(0, aOrdenado[1]);
		assertEquals(0, aOrdenado[2]);
		assertEquals(0, aOrdenado[3]);
		assertEquals(0, aOrdenado[4]);
		assertEquals(0, aOrdenado[5]);
		assertEquals(0, aOrdenado[6]);
		assertEquals(0, aOrdenado[7]);
		assertEquals(0, aOrdenado[8]);
		assertEquals(0, aOrdenado[9]);
	}

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
