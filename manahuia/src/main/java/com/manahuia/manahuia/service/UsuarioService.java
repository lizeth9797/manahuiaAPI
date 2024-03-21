package com.manahuia.manahuia.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.manahuia.manahuia.model.Usuario;

@Service
public class UsuarioService {
	public final ArrayList<Usuario> list = new ArrayList();
	public UsuarioService() {
		list.add( new Usuario("Abigail Arizmend","abi21@gmail.com", "Par4gua$", "5518947544",1));
		list.add( new Usuario("Lizeth Ortiz","liz@gmail.com", "Par4gua$", "5518947544",0));
		list.add( new Usuario("Dita Fernández","dita@gmail.com", "Par4gua$", "5518947544",0));
	}
	public ArrayList<Usuario> getAllUsuarios() {
		return list;
	}
	public Usuario getUsuario(int usuarioId) {
		Usuario tempUsuario=null;
		for (Usuario usuario : list) {
			if(usuario.getId()==usuarioId) {
				tempUsuario=usuario;
				break;
			}
		}
		return tempUsuario;
	}
	public Usuario addUsuario(Usuario usuario) {
		Usuario tempUsuario=null;
		if(list.add(usuario)) {
			tempUsuario=usuario;
		}
		return tempUsuario;
	}
	
	
	
}
	
	
	