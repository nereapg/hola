package com.ipartek.formacion.hola.pojo;

import java.util.ArrayList;

public class Receta {

	// atributos

	public String IMG_DEFAULT = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6GvzNqfRMDYXbhRQm1t7h75SulI1_Vx50a4UgPoDJotTIwjX5";
	private String titulo;
	private String imagen;
	// private Ingrediente[] aIngredientes;
	private int tiempo;
	private String dificultad;
	private int comensales;
	private String descripcion;
	private ArrayList<Ingrediente> aLIngredientes;

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
		// this.aIngredientes = aIngredientes;
		this.tiempo = 0;
		this.dificultad = "No especificado";
		this.comensales = 0;
		this.descripcion = "Sin descripcion";
		this.aLIngredientes = new ArrayList<Ingrediente>();
	}

	// constructor con parametros
	public Receta(String titulo, ArrayList<Ingrediente> aLIngredientes) {
		super();
		this.titulo = titulo;
		// this.aIngredientes = aIngredientes;
		this.tiempo = tiempo;
		this.dificultad = dificultad;
		this.comensales = 4;
		this.descripcion = descripcion;
		// this.aLIngredientes = aLIngredientes;
		setIngredientes(aLIngredientes);
	}

	public Receta(String titulo) {
		super();
		this.titulo = titulo;
		// this.aIngredientes = aIngredientes;
		this.tiempo = tiempo;
		this.dificultad = dificultad;
		this.comensales = 4;
		this.descripcion = descripcion;
		// this.aLIngredientes = aLIngredientes;
		setIngredientes(null);
		this.imagen = IMG_DEFAULT;
	}

	// getters y setters

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/*
	 * public Ingrediente[] getIngredientes() { return aIngredientes; }
	 * 
	 * public void setIngredientes(Ingrediente[] ingredientes) {
	 * this.aIngredientes = ingredientes; }
	 */
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

	public ArrayList<Ingrediente> getIngredientes() {
		return aLIngredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> aLIngredientes) {

		this.aLIngredientes = (aLIngredientes == null) ? new ArrayList<Ingrediente>() : aLIngredientes;
	}

	// otros metodos

	/**
	 * Nos indica si la receta esta libre de ingredientes con gluten
	 * 
	 * @return true si todos los ingredientes no contienen gluten <br>
	 *         false si alguno de los ingredientes contienen gluten <br>
	 *         true si no existen ingredientes
	 */
	public boolean isGlutenFree() {
		boolean rdo = true;
		if (this.aLIngredientes != null) {
			for (Ingrediente i : this.aLIngredientes) {
				if (i.isGluten()) {
					rdo = false;
					break;
				}
			}
		}
		return rdo;
	}

	@Override
	public String toString() {
		return "Receta [titulo=" + titulo + ", imagen=" + imagen + ", tiempo=" + tiempo + ", dificultad=" + dificultad
				+ ", comensales=" + comensales + ", descripcion=" + descripcion + ", aLIngredientes=" + aLIngredientes
				+ "]";
	}

	/**
	 * Comprueba si contiene el {@code Ingrediente} pasado como parametro
	 * 
	 * @param ingrediente
	 *            {@codeIngrediente} a buscar
	 * @return true si contiene ingrediente<br>
	 *         false en caso contrario
	 */
	public boolean contiene(Ingrediente ingrediente) {

		boolean rdo = false;
		if (ingrediente != null) {
			final String NOMBRE_INGREDIENTE_BUSCAR = ingrediente.getNombre();
			Ingrediente iterateIngredient = null;
			for (int i = 0; i < this.aLIngredientes.size(); i++) {
				iterateIngredient = this.aLIngredientes.get(i);
				if (NOMBRE_INGREDIENTE_BUSCAR.equalsIgnoreCase(iterateIngredient.getNombre())) {
					rdo = true;
					break;
				}
			}
		}
		return rdo;
	}

	/**
	 * TODO cuando sea null lanzar Exception personalizada<br>
	 * Añadimos un nuevo {@code Ingrediente} a la receta
	 * 
	 * @param ingrediente
	 *            si es null no hace nada
	 */
	public void addIngrediente(Ingrediente ingrediente) {

		if (aLIngredientes != null) {
			this.aLIngredientes.add(ingrediente);
		}
	}

	/**
	 * Elimina el primer ingrediente que encuentra con el mismo nombre.
	 * CaseInsensitive
	 * 
	 * @param ingrediente
	 *            ingrediente a eliminar
	 * @return true si elimina ingrediente y false en caso contrario
	 */
	public boolean removeIngrediente(Ingrediente ingrediente) {
		boolean rdo = false;
		if (ingrediente != null) {
			final String NOMBRE_INGREDIENTE_ELIMINAR = ingrediente.getNombre();
			Ingrediente iterateIngredient = null;
			for (int i = 0; i < this.aLIngredientes.size(); i++) {
				iterateIngredient = this.aLIngredientes.get(i);

				if (NOMBRE_INGREDIENTE_ELIMINAR.equalsIgnoreCase(iterateIngredient.getNombre())) {
					this.aLIngredientes.remove(i);
					rdo = true;
					break;
				}
			}
		}
		return rdo;
	}
}
