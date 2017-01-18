package com.ipartek.recetas.ejercicios.herencia;

import java.util.ArrayList;

public class Animal {

	private String raza;
	private float precio;

	public Animal() {
		super();
	}

	public Animal(String raza, float precio) {
		super();
		this.raza = raza;
		this.precio = precio;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Animal [raza=" + raza + ", precio=" + precio + "]";
	}

	public static void main(String[] args) {

		Burro b1 = new Burro("Platero");
		b1.setRaza("Burro encartado");
		b1.setPrecio(100);
		// b1.setNombre("Platero");

		Burro b2 = new Burro("Margarita");
		b2.setRaza("Burro encartado");
		b2.setPrecio(150);

		Pajaro p1 = new Pajaro(true);
		p1.setRaza("Buitre");
		p1.setPrecio(75);
		// p1.puedeVolar(true);

		Pajaro p2 = new Pajaro(false);
		p2.setRaza("Gallina");
		p2.setPrecio(25);

		ArrayList<Vendible> animVend = new ArrayList<Vendible>();
		animVend.add(b1);
		animVend.add(b2);
		animVend.add(p1);
		animVend.add(p2);

		// mostrar por pantalla
		for (Vendible animal : animVend) {

			if (animal instanceof Pajaro) {
				System.out.println("PAJARO");
				System.out.println("Raza: " + ((Pajaro) animal).getRaza());
				System.out.println("Precio: " + ((Pajaro) animal).getPrecio());
				System.out.println(animal.toString());

			} else if (animal instanceof Burro) {
				System.out.println("BURRO");
				System.out.println("Raza: " + ((Burro) animal).getRaza());
				System.out.println("Precio: " + ((Burro) animal).getPrecio());
				System.out.println(animal.toString());
			}
			// System.out.println(animal.toString());
			System.out.println("Generando factura...");
			System.out.println();
		}

	}

}
