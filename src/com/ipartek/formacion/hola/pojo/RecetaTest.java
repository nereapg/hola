package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RecetaTest {

	// variables globales, se inicializan en "setUp"
	public Receta tortillaPatata = null;
	public Ingrediente huevos = new Ingrediente(12, "huevos", true);
	public Ingrediente cebolla = new Ingrediente(1, "cebolla", true);
	public Ingrediente patatas = new Ingrediente(4, "patatas", true);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		tortillaPatata = new Receta("Tortilla de patata", null);
		tortillaPatata.addIngrediente(huevos);
		tortillaPatata.addIngrediente(cebolla);
		tortillaPatata.addIngrediente(patatas);
	}

	@After
	public void tearDown() throws Exception {

		tortillaPatata = null;
	}

	@Test
	public void testAddIngrediente() {
		Receta r = new Receta("Tortilla de patata", null);
		int numero = r.getIngredientes().size();
		assertEquals("No deben existir ingredientes", 0, numero);

		r.addIngrediente(null);
		numero = r.getIngredientes().size();
		assertEquals("No deben existir ingredientes", 0, numero);

		r.addIngrediente(new Ingrediente(0, "", true));
		numero = r.getIngredientes().size();
		assertEquals(1, numero);
	}

	@Test
	public void testContiene() {

		Receta r = new Receta("Tortilla de patata", null);
		assertFalse(r.contiene(null));

		tortillaPatata.addIngrediente(huevos);

		huevos.setNombre("HueVos");
		tortillaPatata.contiene(huevos);

		ArrayList<Ingrediente> aLIngredientes = tortillaPatata.getIngredientes();
		// assertEquals(3, aLIngredientes.size());
		assertEquals(aLIngredientes, tortillaPatata);

	}

	@Test
	public void testRemoveIngrediente() {

		Receta r = new Receta("Tortilla de patata", null);
		assertFalse(r.removeIngrediente(null));

		tortillaPatata.addIngrediente(huevos);

		huevos.setNombre("HueVos");
		tortillaPatata.removeIngrediente(huevos);

		ArrayList<Ingrediente> aLIngredientes = tortillaPatata.getIngredientes();
		assertEquals(3, aLIngredientes.size());

		// TODO comprobar que sean huevo, cebolla y patatas
		assertFalse(tortillaPatata.contiene(null));
		assertFalse(tortillaPatata.contiene(new Ingrediente(2, "Salmonela", true)));
		assertTrue(tortillaPatata.contiene(huevos));
		assertTrue(tortillaPatata.contiene(cebolla));
		assertTrue(tortillaPatata.contiene(patatas));
	}

	@Test
	public void testConstructor() {

		Receta r = new Receta("Tortilla de patata", null);
		assertNotNull("Deberia estar inicializado a new", r.getIngredientes());
	}

	@Test
	public void testIsGlutenFree() {
		ArrayList<Ingrediente> aLIngredientes = new ArrayList<Ingrediente>();
		aLIngredientes.add(new Ingrediente(4, "patatas", true));
		aLIngredientes.add(new Ingrediente(500, "bonito", true));
		aLIngredientes.add(new Ingrediente(2, "cebolletas", true));

		// caso 1 todos los ingredientes con gluten
		Receta r = new Receta("", aLIngredientes);
		assertFalse("todos los ingredientes con gluten", r.isGlutenFree());

		// caso 2 todos los ingredientes sin gluten
		aLIngredientes.add(new Ingrediente(0, "", false));
		aLIngredientes.add(new Ingrediente(0, "", false));

		r = new Receta("", aLIngredientes);
		assertTrue("todos los ingredientes sin gluten", r.isGlutenFree());

		// caso3 todos los ingredientes con y sin gluten
		aLIngredientes.clear();
		aLIngredientes.add(new Ingrediente(0, "", true));
		aLIngredientes.add(new Ingrediente(0, "", false));

		r = new Receta("", aLIngredientes);
		assertFalse("caso3 todos los ingredientes con y sin gluten", r.isGlutenFree());

		// caso4 sin ingredientes (null)
		r = new Receta("", null);
		assertTrue("caso4 sin ingredientes", r.isGlutenFree());
	}

}
