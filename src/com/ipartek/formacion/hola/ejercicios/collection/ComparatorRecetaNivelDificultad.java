package com.ipartek.formacion.hola.ejercicios.collection;

import java.util.Comparator;

import com.ipartek.formacion.hola.pojo.Receta;

public class ComparatorRecetaNivelDificultad implements Comparator<Receta> {

	@Override
	public int compare(Receta r1, Receta r2) {

		return getPesoDificultad(r1) - getPesoDificultad(r2);
	}

	private int getPesoDificultad(Receta r) {

		int resul = 0;

		switch (r.getDificultad()) {
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
