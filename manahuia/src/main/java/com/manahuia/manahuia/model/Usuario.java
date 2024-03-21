package com.manahuia.manahuia.model;

public class Usuario {
	private int id;
	private String nombre;
	private String correo;
	private String password;
	private String telefono;
	private int tipo_usuario;
	private static int total=0;


	public Usuario(String nombre, String correo, String password, String telefono,
			int tipo_usuario) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
		this.telefono = telefono;
		this.tipo_usuario = tipo_usuario;
		Usuario.total++;
		id=Usuario.total;
	}	
	
	public Usuario() {
		Usuario.total++;
		id=Usuario.total;	
	}
	
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(int tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", password=" + password
				+ ", confirmpassword="  + ", telefono=" + telefono + ", tipo_usuario=" + tipo_usuario
				+ "]";
	}	
}