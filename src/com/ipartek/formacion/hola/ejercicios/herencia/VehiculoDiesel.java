package com.ipartek.formacion.hola.ejercicios.herencia;

public class VehiculoDiesel extends Vehiculo {

	public final int MIN_COMBUSTIBLE = 95;

	private int combustible;

	public VehiculoDiesel() {
		super();
		this.combustible = 95;
	}

	public VehiculoDiesel(String modelo) {
		super(modelo);
		this.combustible = MIN_COMBUSTIBLE;
	}

	@Override
	public void arrancar() {
		System.out.println("arrancado");
	}

	public int getCombustible() {
		return combustible;
	}

	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		return "VehiculoDiesel [MIN_COMBUSTIBLE=" + MIN_COMBUSTIBLE + ", combustible=" + combustible + "]";
	}

}
