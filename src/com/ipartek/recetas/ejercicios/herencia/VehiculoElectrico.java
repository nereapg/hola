package com.ipartek.recetas.ejercicios.herencia;

public class VehiculoElectrico extends Vehiculo {

	public final float MIN_CAPACIDAD_BATERIA = 100;

	private float capacidadBaterias;

	public VehiculoElectrico() {
		super();
		this.capacidadBaterias = 300;
	}

	public VehiculoElectrico(String modelo) {
		super(modelo);
		this.capacidadBaterias = MIN_CAPACIDAD_BATERIA;
	}

	@Override
	public void arrancar() {
		System.out.println("bateria enchufada");
	}

	public float getCapacidadBaterias() {
		return capacidadBaterias;
	}

	public void setCapacidadBaterias(float capacidadBaterias) {
		this.capacidadBaterias = capacidadBaterias;
	}

	@Override
	public String toString() {
		return "VehiculoElectrico [MIN_CAPACIDAD_BATERIA=" + MIN_CAPACIDAD_BATERIA + ", capacidadBaterias="
				+ capacidadBaterias + "] extends" + super.toString();
	}
}
