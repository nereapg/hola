package com.ipartek.formacion.hola;

/**
 * Clase {@code Utilidades} con metodos estaticos y comunes. <br>
 * Por ejemplo: generar numeros aleatorios, validaciones, etc
 * 
 * @author Curso
 *
 */
public class Utilidades {
	/**
	 * generar numero {@code int} aleatorio desde 0 hasta <b>,maximoValor</b>
	 * 
	 * @param maximoValor
	 */
	static public int getNumeroAleatorio(int maximoValor) {
		return (int) (Math.random() * maximoValor);
	}
	// *********************************

	static public int[] bubbleSort(int[] aDesordenado) {
		return aDesordenado;
	}

	/**
	 * 
	 * @param num1
	 *            entero a sumar
	 * @param num2
	 *            entero a sumar
	 * @return suma de los dos parametros, pero:<br>
	 *         si cualquiera de los dos es negativo return 0<br>
	 *         si la suma es superior a 100 return 0
	 */
	static public int sumaTonta(int num1, int num2) {
		int resultado = -1;

		if (num1 < 0 || num2 < 0) {
			return 0;
		} else {
			if (num1 + num2 > 100) {
				return 0;
			} else {
				resultado = num1 + num2;
			}
			return resultado;
		}
	}
}
