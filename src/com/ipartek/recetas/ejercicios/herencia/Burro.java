package com.ipartek.recetas.ejercicios.herencia;

import java.util.ArrayList;

import com.ipartek.formacion.hola.pojo.Ingrediente;

public class Burro extends Animal implements Conducible, Cocinable, Vendible {

	private String nombre;

	public Burro(String nombre) {
		super();
		setRaza("Burro");
		this.nombre = nombre;
	}

	public Burro(String raza, float precio) {
		super(raza, precio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void arrancar() {
		System.out.println("Arre burro");
	}

	@Override
	public void detener() {
		System.out.println("Soooooo");
	}

	@Override
	public void girar(String direccion) {
		System.out.println("giro a" + direccion);
	}

	@Override
	public void generarFactura() {
		System.out.println("Factura generada");
	}

	@Override
	public String toString() {
		return "nombre: " + nombre;
	}

	@Override
	public ArrayList<Ingrediente> getIngredientes() {

		return new ArrayList<Ingrediente>();
	}

	@Override
	public String getDescripcionReceta() {
		return "Salpimentar y a la cazuela";

	}

}
