package com.ipartek.formacion.hola.ejercicios.herencia;

import java.util.ArrayList;

/**
 * Ejercicio
 * 
 * @author Curso
 *
 */
public class ListaAnimalesTienda {

	public static void main(String[] args) {

		// crear objetos

		Burro b1 = new Burro("Platero");
		b1.setRaza("Burro encartado");
		b1.setPrecio(100);

		Burro b2 = new Burro("Margarita");
		b2.setRaza("Burro encartado");
		b2.setPrecio(150);

		Pajaro p1 = new Pajaro("Buitre", 75f);
		p1.setPuedeVolar(true);

		Pajaro p2 = new Pajaro("Gallina", 25f);
		p2.setPuedeVolar(false);

		// añadir en ArrayList

		ArrayList<Vendible> stock = new ArrayList<Vendible>();
		stock.add(b1);
		stock.add(b2);
		stock.add(p1);
		stock.add(p2);

		// mostrar por pantalla
		Burro b = null;
		Pajaro p = null;

		for (Vendible v : stock) {

			if (v instanceof Pajaro) {
				p = (Pajaro) v;
				System.out.println(p.getRaza());
				System.out.println("Precio " + p.getPrecio());
				System.out.println("Comestible: No");
				if (p.isPuedeVolar()) {
					System.out.println("Volador: Si");
				} else {
					System.out.println("Volador: No");
				}

			} else if (v instanceof Burro) {
				b = (Burro) v;
				System.out.println(b.getRaza() + "[" + b.getNombre() + "]");
				System.out.println("Precio " + b.getPrecio());
				System.out.println("Comestible: Si");
				System.out.println("Volador: No");
			} else {
				System.out.println("No sabemos que es " + v.toString());
				// System.out.println(animal.toString());
				// System.out.println("Generando factura...");
			}
			System.out.println();
		}

	}

}
