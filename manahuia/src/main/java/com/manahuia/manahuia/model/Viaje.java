package com.manahuia.manahuia.model;

public class Viaje {
	private int id;
	private String nombre_destino;
	private String fecha_inicio; //YYYY-MM-DD
	private String fecha_final;  //YYYY-MM-DD
	private int duracion_dias;
	private String incluye;
	private String descripcion;
	private double precio;
	private String imagenes;
	private int stock;
	private static int total=0;

	
	public Viaje(String nombre_destino, String fecha_inicio, String fecha_final, int duracion_dias, String incluye,
			String descripcion, double precio, String imagenes, int stock) {
		super();
		this.nombre_destino = nombre_destino;
		this.fecha_inicio = fecha_inicio;
		this.fecha_final = fecha_final;
		this.duracion_dias = duracion_dias;
		this.incluye = incluye;
		this.descripcion = descripcion;
		this.precio = precio;
		this.imagenes = imagenes;
		this.stock = stock;
		Viaje.total++;
		id=Viaje.total;
	}
	
	public Viaje() {
		Viaje.total++;
		id=Viaje.total;
	}

	public int getId() {
		return id;
	}
	public String getNombre_destino() {
		return nombre_destino;
	}

	public void setNombre_destino(String nombre_destino) {
		this.nombre_destino = nombre_destino;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getFecha_final() {
		return fecha_final;
	}

	public void setFecha_final(String fecha_final) {
		this.fecha_final = fecha_final;
	}

	public int getDuracion_dias() {
		return duracion_dias;
	}

	public void setDuracion_dias(int duracion_dias) {
		this.duracion_dias = duracion_dias;
	}

	public String getIncluye() {
		return incluye;
	}

	public void setIncluye(String incluye) {
		this.incluye = incluye;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getImagenes() {
		return imagenes;
	}

	public void setImagenes(String imagenes) {
		this.imagenes = imagenes;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Viaje [id=" + id + ", nombre_destino=" + nombre_destino + ", fecha_inicio=" + fecha_inicio
				+ ", fecha_final=" + fecha_final + ", duracion_dias=" + duracion_dias + ", incluye=" + incluye
				+ ", descripcion=" + descripcion + ", precio=" + precio + ", imagenes=" + imagenes + ", stock=" + stock
				+ "]";
	}
}
