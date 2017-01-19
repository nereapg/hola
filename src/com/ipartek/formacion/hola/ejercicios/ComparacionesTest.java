package com.ipartek.formacion.hola.ejercicios;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ipartek.formacion.hola.ejercicios.collection.ComparatorRecetaNivelDificultad;
import com.ipartek.formacion.hola.pojo.Receta;

public class ComparacionesTest {

	ArrayList<Receta> recetas = new ArrayList<Receta>();
	Receta solomillo = new Receta("solomillo");
	Receta marmitako = new Receta("marmitako");
	Receta tortilla = new Receta("tortilla");

	@Before
	public void setUp() throws Exception {

		solomillo.setDificultad(Receta.MODERADO);
		marmitako.setDificultad(Receta.DIFICIL);
		tortilla.setDificultad(Receta.FACIL);

		recetas.add(solomillo);
		recetas.add(marmitako);
		recetas.add(tortilla);
	}

	@After
	public void tearDown() throws Exception {

		solomillo = null;
		marmitako = null;
		tortilla = null;
	}

	@Test
	public void testComparable() {

		// ordenar A-Z
		Collections.sort(recetas);
		// comprobar
		assertEquals(marmitako, recetas.get(0));
		assertEquals(solomillo, recetas.get(1));
		assertEquals(tortilla, recetas.get(2));

		// ordenar Z-A
		Collections.sort(recetas, Collections.reverseOrder());
		assertEquals(marmitako, recetas.get(2));
		assertEquals(solomillo, recetas.get(1));
		assertEquals(tortilla, recetas.get(0));
	}

	@Test
	public void testComparator() {

		final String MSG_ERROR = "No ordena por nivel de dificultad";

		Collections.sort(recetas, new ComparatorRecetaNivelDificultad());

		// ordenar
		assertEquals(tortilla, recetas.get(2));
		assertEquals(solomillo, recetas.get(1));
		assertEquals(marmitako, recetas.get(0));

	}

}
