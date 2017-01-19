package com.ipartek.formacion.hola.ejercicios.collection;

import java.util.ArrayList;
import java.util.Comparator;

import com.ipartek.formacion.hola.ejercicios.herencia.IEstupida;

public class ComparatorPajaroVehiculo implements Comparator<IEstupida>{
	
	ArrayList<IEstupida> = new ArrayList;
	
	@Override
	public int compare(Object or1, Object o2) {

		return getPeso(o1) - getPeso(o2);
	}
	
	private int getPeso(Object o) {

		int resul = 0;

		switch (o.getDificultad()) {
		case Receta.FACIL:
			resul = 0;
			break;
		case Receta.MODERADO:
			resul = 5;
			break;
		case Receta.DIFICIL:
			resul = 10;
			break;
		}
		return resul;
	}
}
