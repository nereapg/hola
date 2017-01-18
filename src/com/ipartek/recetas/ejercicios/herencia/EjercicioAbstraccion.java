package com.ipartek.recetas.ejercicios.herencia;

/**
 * Comprobar que solo podemos instanciar objetos en las clases que NO sean
 * ABSTRACTAS
 * 
 * @author Curso
 *
 */
public class EjercicioAbstraccion {

	public static void main(String[] args) {
		// ObjetoGrafico og = new ObjetoGrafico(0,0);
		Linea linea = new Linea(0, 0);
		// En principio no se puede instanciar un objeto de clase abstracta
		// a menos que se implemente en el momento de la declaracion

		// clase anonima
		Circulo c = new Circulo(5, 5) {

			@Override
			public void dibujar() {
				System.out.println("Dibujando circulo");
			}
		};
		CirculoNoAbstracto c2 = new CirculoNoAbstracto(0, 0);
	}
}