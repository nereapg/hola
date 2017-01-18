package com.ipartek.recetas.ejercicios.herencia;

import java.util.ArrayList;

/**
 * Listar todos los vehiculos del concesionario
 * 
 * @author Curso
 *
 */

public class EjercicioConcesionario {

	public static void main(String[] args) {

		// crear vehiculos

		Vehiculo v1 = new Vehiculo("prius");
		v1.setPlazas(5);
		v1.setDimensiones(0);
		v1.setPotencia(300);

		Vehiculo v2 = new Vehiculo("ibiza");
		v2.setPlazas(5);
		v2.setDimensiones(0);
		v2.setPotencia(500);

		Vehiculo v3 = new Vehiculo("fiesta");
		v3.setPlazas(4);
		v3.setDimensiones(0);
		v3.setPotencia(100);

		VehiculoElectrico ve1 = new VehiculoElectrico("Tesla");
		ve1.setPlazas(5);
		ve1.setDimensiones(0);
		ve1.setPotencia(150);
		ve1.setCapacidadBaterias(500);

		VehiculoDiesel vd1 = new VehiculoDiesel("Citroen Sara");
		vd1.setPlazas(5);
		vd1.setDimensiones(0);
		vd1.setPotencia(100);
		vd1.setCombustible(95);

		VehiculoDiesel vd2 = new VehiculoDiesel("Opel Astra");
		vd2.setPlazas(5);
		vd2.setDimensiones(0);
		vd2.setPotencia(120);
		vd2.setCombustible(98);

		ArrayList<Vehiculo> stock = new ArrayList<Vehiculo>();
		stock.add(v1);
		stock.add(v2);
		stock.add(v3);
		stock.add(ve1);
		stock.add(vd1);
		stock.add(vd2);

		// mostrar por pantalla
		for (Vehiculo vehiculo : stock) {
			System.out.println();
			System.out.println(vehiculo.getModelo());
			System.out.println("Plazas: " + vehiculo.getPlazas());
			System.out.println("Dimensiones: " + vehiculo.getDimensiones());
			System.out.println("Potencia: " + vehiculo.getPotencia());

			if (vehiculo instanceof VehiculoElectrico) {
				System.out.println("Capacidad bateria: " + ((VehiculoElectrico) vehiculo).getCapacidadBaterias());
			} else if (vehiculo instanceof VehiculoDiesel) {
				System.out.println("Combustible: " + ((VehiculoDiesel) vehiculo).getCombustible());
			}
		}

	}

}
