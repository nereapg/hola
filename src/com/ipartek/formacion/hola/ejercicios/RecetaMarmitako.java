package com.ipartek.formacion.hola.ejercicios;

import com.ipartek.formacion.hola.pojo.Ingrediente;
import com.ipartek.formacion.hola.pojo.Receta;

public class RecetaMarmitako {

	public static void main(String[] args) {
		/*
		 * // Crear ingredientes con array Ingrediente[] aIngredientes = { new
		 * Ingrediente(4, "patatas", false), new Ingrediente(500, "bonito",
		 * false), new Ingrediente(2, "cebolletas", false), new Ingrediente(2,
		 * "pimientos verdes", false), new Ingrediente(1, "cabeza de ajo",
		 * false) };
		 */

		// ArrayList<Ingrediente> aLIngredientes= new ArrayList<Ingrediente>

		// Crear receta
		Receta marmitako = new Receta();
		marmitako.setTitulo("Marmitako by Karlos");
		marmitako.setComensales(4);
		marmitako.setDescripcion("Corta...");
		marmitako.setDificultad("Media");
		marmitako.setTiempo(90);
		marmitako.addIngrediente(new Ingrediente(500, "bonito", false));

		// mostrar por pantalla
		System.out.println("Marmitako rico rico, la receta es:");
		if (!marmitako.isGlutenFree()) {
			System.out.println("contiene gluten");
		}
		System.out.println(marmitako.toString());
	}

}
