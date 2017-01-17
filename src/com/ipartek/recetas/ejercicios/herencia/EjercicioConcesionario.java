package com.ipartek.recetas.ejercicios.herencia;

/**
 * Listar todos los vehiculos del concesionario
 * 
 * @author Curso
 *
 */

public class EjercicioConcesionario {

	public static void main(String[] args) {

		// ArrayList<Vehiculo> aLVehiculos = {new aLVehiculos("prius")};
		// ArrayList<Vehiculo> aLVehiculos= new ArrayList<Vehiculo>

		// crear vehiculos

		Vehiculo prius = new Vehiculo("prius");
		prius.setPlazas(5);
		prius.setDimensiones(0);
		prius.setPotencia(300);

		// mostrar por pantalla
		System.out.println(prius.toString());
	}

}
