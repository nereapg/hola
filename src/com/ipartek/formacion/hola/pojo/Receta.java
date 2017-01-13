package com.ipartek.formacion.hola.pojo;

public class Receta {

	// atributos
	private String titulo;
	static Ingrediente[] aIngredientes = { new Ingrediente(4, "patatas", false), new Ingrediente(500, "bonito", false),
			new Ingrediente(2, "cebolletas", false), new Ingrediente(2, "pimientos verdes", false),
			new Ingrediente(1, "cabeza de ajo", false) };
	private int tiempo;
	String dificultad;
	int comensales;
	String descripcion;

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
	public Receta() {
		super();
		this.titulo = "Sin nombre";
		// this.aIngredientes =Ingrediente[];
		this.tiempo = 0;
		this.dificultad = " ";
		this.comensales = 0;
		this.descripcion = "Sin descripcion";
	}

	// constructor con parametros
	public Receta(String titulo, Ingrediente[] ingredientes, int tiempo, String dificultad, int comensales,
			String descripcion) {
		super();
		this.titulo = "marmitako";
		this.setIngredientes(ingredientes);
		this.tiempo = 20;
		this.dificultad = "Facil";
		this.comensales = 4;
		this.descripcion = "Retira el rabo y las pepitas a los mientos choriceros y ponlos a hidratar en un cuenco con agua caliente. Cuando estén bien hidratados, retírales la carne y resérvala. Pela las patatas, cáscalas y ponlas a cocer en una cazuela con agua, un chorrito de brandy y la guindilla cayena. Ata una cabeza de ajo con una cuerda de cocina a un asa de la cazuela y cuélgala dentro. Sazona. Cuece todo junto durante 15-20 minutos. Reserva.";
	}

	// getters y setters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Ingrediente[] getIngredientes() {
		return aIngredientes;
	}

	public void setIngredientes(Ingrediente[] ingredientes) {
		this.aIngredientes = ingredientes;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public int getComensales() {
		return comensales;
	}

	public void setComensales(int comensales) {
		this.comensales = comensales;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// otros metodos

	@Override
	public String toString() {
		return "Receta [titulo=" + titulo + ", tiempo=" + tiempo + ", dificultad=" + dificultad + ", comensales="
				+ comensales + ", descripcion=" + descripcion + "]";
	}

	public static void main(String[] args) {

		Receta marmitako = new Receta(String titulo, Ingrediente[] ingredientes, int tiempo, String dificultad, int comensales,
				String descripcion);
		// marmitako.setIngredientes(aIngredientes);
		System.out.println(marmitako.toString());

	}

}
