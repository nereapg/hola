package com.ipartek.formacion.hola.ejercicos;

public class CalcularVueltas {

	public static void main(String[] args) {

		float compra = (float) 1326.24;
		float pago = 4 * 500;
		float resto = pago - compra;
		final float[] BILLETES_MONEDAS = { 50, 20, 10, 5, 2, 1, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f };
		int[] aVueltas = new int[BILLETES_MONEDAS.length];

		// calcular Vueltas
		for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
			aVueltas[i] = (int) (resto / BILLETES_MONEDAS[i]);
			resto = resto - BILLETES_MONEDAS[i] * aVueltas[1];
		}

		System.out.println("--------RESULTADO--------");
		System.out.println("PAGO: " + compra + "€");
		System.out.println("RETORNO: " + (pago - compra) + "€");

		for (int i = 0; i < aVueltas.length; i++) { System.out.println(aVueltas[i] + " " + literales[i]); } System.out.println("-------------------------"); System.out.println("- gracias por su visita -"); System.out.println("-------------------------"); } }

System.out.println("En "+bill50+" billetes de 50");
/*
 * System.out.println("En " + bill20 + " billetes de 20"); System.out.println(
 * "En " + bill10 + " billetes de 10"); System.out.println("En " + bill5 +
 * " billetes de 5"); System.out.println("En " + mon2 + " monedas de 2 €uros");
 * System.out.println("En " + mon1 + " monedas de 1 €uro"); System.out.println(
 * "En " + mon50 + " monedas de 50 céntimos"); System.out.println("En " + mon20
 * + " monedas de 20 céntimos"); System.out.println("En " + mon10 +
 * " monedas de 10 céntimos"); System.out.println("En " + mon5c +
 * " monedas de 5 céntimos"); System.out.println("En " + mon2c +
 * " monedas de 2 céntimos"); System.out.println("En " + mon1c +
 * " monedas de 1 céntimo");
 * 
 * System.out.println("-------------------------");
 */

}

}
