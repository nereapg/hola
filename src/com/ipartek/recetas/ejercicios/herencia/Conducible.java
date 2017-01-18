package com.ipartek.recetas.ejercicios.herencia;

import java.io.Serializable;

/**
 * Las interfaces nunca pueden tener codigo implementado. Pueden existir
 * interfaces vacias Soportan herencia multiple al contrario que las clases.
 * Pueden contener variables, pero seran finales
 */
public interface Conducible extends Serializable, Cloneable {

	final String DERECHA = "giro derecha";
	final String IZQUIERDA = "giro izquierda";

	void arrancar();

	void detener();

	void girar(String direccion);

}
