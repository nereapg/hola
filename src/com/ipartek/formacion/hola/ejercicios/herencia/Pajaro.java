package com.ipartek.formacion.hola.ejercicios.herencia;

public class Pajaro extends Animal implements Volador, Vendible {

	boolean puedeVolar;

	public Pajaro(boolean puedeVolar) {
		super();
		this.puedeVolar = puedeVolar;
	}

	public Pajaro(String raza, float precio) {
		super(raza, precio);
	}

	public boolean isPuedeVolar() {
		return puedeVolar;
	}

	public void setPuedeVolar(boolean puedeVolar) {
		this.puedeVolar = puedeVolar;
	}

	@Override
	public void despegar() {
		System.out.println("Ha despegado");
	}

	@Override
	public void aterrizar() {
		System.out.println("Ha aterrizado");
	}

	@Override
	public String toString() {
		return "puedeVolar=" + puedeVolar;
	}

	@Override
	public void generarFactura() {
		System.out.println("Factura");
	}
}
