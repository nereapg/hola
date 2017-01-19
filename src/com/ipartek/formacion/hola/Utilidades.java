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

	static public int[] bubbleSort(int[] aDesordenado) {

		int temp = 0;
		for (int i = 0; i < aDesordenado.length; i++) {
			for (int j = 1; j < (aDesordenado.length - i); j++) {

				if (aDesordenado[j - 1] > aDesordenado[j]) {
					temp = aDesordenado[j - 1];
					aDesordenado[j - 1] = aDesordenado[j];
					aDesordenado[j] = temp;
				}
			}
		}
		return aDesordenado;
	}

	public static void main(String[] args) {

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
			System.out.print(aDesordenado[i] + " ");
		}
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
