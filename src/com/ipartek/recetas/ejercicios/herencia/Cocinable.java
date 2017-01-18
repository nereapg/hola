package com.ipartek.recetas.ejercicios.herencia;

import java.util.ArrayList;

import com.ipartek.formacion.hola.pojo.Ingrediente;

public interface Cocinable {

	ArrayList<Ingrediente> getIngredientes();

	String getDescripcionReceta();

}
