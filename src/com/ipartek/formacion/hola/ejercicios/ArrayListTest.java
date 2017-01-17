package com.ipartek.formacion.hola.ejercicios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Aprendiendo a usar ArrayList
 * 
 * @author curso
 *
 */
public class ArrayListTest {

	ArrayList<String> paises;

	@Test
	public void test() {

		assertNull("Deberia ser null", paises);

		ArrayList<String> paises = null;
		paises = new ArrayList<String>();
		assertNotNull("No deberia ser null", paises);

		assertEquals("0 paises", 0, paises.size());

		paises.add("EH");
		assertEquals("1 pais", 1, paises.size());

		paises.add("Portugal");
		paises.add("Italia");
		paises.add("Francia");
		paises.add("Canadá");

		assertEquals(5, paises.size());

		assertEquals("Francia", paises.remove(3));
		assertEquals(4, paises.size());

		paises.add(1, "Irlanda");
		assertEquals(5, paises.size());
		assertEquals("EH", paises.get(0));
		assertEquals("Irlanda", paises.get(1));
		assertEquals("Italia", paises.get(2));

	}

}
