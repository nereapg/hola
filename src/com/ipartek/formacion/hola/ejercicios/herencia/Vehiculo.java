package com.ipartek.formacion.hola.ejercicios.herencia;

public class Vehiculo implements Conducible {

	private String modelo;
	private int plazas;
	private float dimensiones;
	private float potencia;

	public Vehiculo() {
		super();
		this.modelo = "";
		this.plazas = 1;
		this.dimensiones = 0;
		this.potencia = 0;
	}

	public Vehiculo(String modelo) {
		this();
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public float getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(float dimensiones) {
		this.dimensiones = dimensiones;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public static void main(String[] args) {

	}

	@Override
	public void arrancar() {
		System.out.println("Vehiculo arrancado");
	}

	/**
	 * al ser un metodo final no puede ser sobreescrito por los hijos
	 */
	final public void detener() {
		System.out.println("Estoy parado");
	}

	@Override
	public String toString() {
		return "Vehiculo [modelo=" + modelo + ", plazas=" + plazas + ", dimensiones=" + dimensiones + ", potencia="
				+ potencia + "]";
	}

	@Override
	public void girar(String direccion) {
		System.out.println("gira a" + direccion);

	}

}
