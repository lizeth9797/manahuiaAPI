package com.manahuia.manahuia.model;

public class Pedido {
	private int id;
	private String fecha_creacion;
	private int cantidad_personas;
	private double totalPedido;
	private int id_viaje;
	private int id_usuario;
	private static int total=0;
	
	public Pedido(String fecha_creacion, int cantidad_personas, double totalPedido, int id_viaje, int id_usuario) {
		super();
		this.fecha_creacion = fecha_creacion;
		this.cantidad_personas = cantidad_personas;
		this.totalPedido = totalPedido;
		this.id_viaje = id_viaje;
		this.id_usuario = id_usuario;
		Pedido.total++;
		id=Pedido.total;
	}
	
	public Pedido() {
		Pedido.total++;
		id=Pedido.total;		}
	
	public int getId() {
		return id;
	}
	public String getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(String fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public int getCantidad_personas() {
		return cantidad_personas;
	}

	public void setCantidad_personas(int cantidad_personas) {
		this.cantidad_personas = cantidad_personas;
	}

	public double getTotalPedido() {
		return totalPedido;
	}

	public void setTotalPedido(double totalPedido) {
		this.totalPedido = totalPedido;
	}

	public int getId_viaje() {
		return id_viaje;
	}

	public void setId_viaje(int id_viaje) {
		this.id_viaje = id_viaje;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", fecha_creacion=" + fecha_creacion + ", cantidad_personas=" + cantidad_personas
				+ ", totalPedido=" + totalPedido + ", id_viaje=" + id_viaje + ", id_usuario=" + id_usuario + "]";
	}
}
