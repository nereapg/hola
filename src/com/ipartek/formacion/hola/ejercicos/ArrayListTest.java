package com.ipartek.formacion.hola.ejercicos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayListTest {

	ArrayList<String> paises;

	@Test
	public void test() {

		ArrayList<String> paises = null;

		assertNull("Deberia ser null", paises);

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
		paises.add(1, "Portu");
		assertEquals(5, paises.size());
		assertEquals("EH", paises.get(0));
		assertEquals("Portugal", paises.get(1));
		assertEquals("Italia", paises.get(2));

	}

}
