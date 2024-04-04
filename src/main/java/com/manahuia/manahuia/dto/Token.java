package com.manahuia.manahuia.dto;

public class Token {
	private final String accessToken;	
	private final Long tipoUsuario;


	public Token(String accessToken, Long tipoUsuario) {
		super();
		this.accessToken = accessToken;
		this.tipoUsuario = tipoUsuario;
	}//constructor

	public String getAccessToken() {
		return accessToken;
	}

	public Long getTipoUsuario() {
		return tipoUsuario;
	}
}