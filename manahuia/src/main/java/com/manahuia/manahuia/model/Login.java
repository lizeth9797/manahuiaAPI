package com.manahuia.manahuia.model;

public class Login {
	private int id;
	private String correo;
	private String password;
	private int tipo_usuario;
	private int id_usuario;
	private static int total=0;
	
	public Login(String correo, String password, int tipo_usuario, int id_usuario) {
		super();
		this.correo = correo;
		this.password = password;
		this.tipo_usuario = tipo_usuario;
		this.id_usuario = id_usuario;
		Login.total++;
		id=Login.total;	
	}
	
	public Login() {
		Login.total++;
		id=Login.total;	
	}
	
	public int getId() {
		return id;
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

	public int getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(int tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", correo=" + correo + ", password=" + password + ", tipo_usuario=" + tipo_usuario
				+ ", id_usuario=" + id_usuario + "]";
	}
}
