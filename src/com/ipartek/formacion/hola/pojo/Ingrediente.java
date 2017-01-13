package com.ipartek.formacion.hola.pojo;

public class Ingrediente {

	// atributos
	private float cantidad;
	private String nombre;
	private boolean gluten;

	/*
	 * constructores
	 * 
	 * Sirven para instanciar o crear objetos de la clase <br> Tienen el mismo
	 * nombre que la clase No hace falta especificar el <code>return</code>
	 * 
	 * sobrecarga: es un metodo con el mismo nombre y mismo return, <br> pero
	 * diferentes parametros
	 */

	// constructor por defecto
	public Ingrediente() {
		super();
		this.cantidad = 0;
		this.nombre = "desconocido";
		this.gluten = true;
	}

	// constructor con parametros
	public Ingrediente(float cantidad, String nombre, boolean gluten) {
		super();
		this.setCantidad(cantidad);
		this.nombre = nombre;
		this.gluten = false;
	}

	// getters y setters

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isGluten() {
		return gluten;
	}

	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}

	// otros metodos

	@Override
	public String toString() {
		return "Ingrediente [nombre=" + nombre + ", cantidad=" + cantidad + ", gluten=" + gluten + "]";
	}

}
