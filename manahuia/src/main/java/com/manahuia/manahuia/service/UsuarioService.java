package com.manahuia.manahuia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manahuia.manahuia.dto.ChangePassword;
import com.manahuia.manahuia.model.Usuario;
import com.manahuia.manahuia.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	public final UsuarioRepository usuarioRepository;
	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository=usuarioRepository;
	}	
	
	public List<Usuario> getAllUsuarios() {
		return usuarioRepository.findAll();
	}
	
	public Usuario getUsuario(Long usuarioId) {
		return usuarioRepository.findById(usuarioId).orElseThrow(
				()->new IllegalArgumentException("El usuario con el id ["+usuarioId+"] no existe"));
	}
		
	public Usuario addUsuario(Usuario usuario) {
		Usuario tempUsuario=null;
		if(usuarioRepository.findByCorreo(usuario.getCorreo()).isEmpty()){
			tempUsuario = usuarioRepository.save(usuario);
		 }else{
		 		System.out.println("El usuario con el email ["+usuario.getCorreo()+"]");
		 }
		return tempUsuario;	
	}
	
	public Usuario updateUsuario(Long usuarioId, ChangePassword changePassword) {
		Usuario tempUsuario=null;
		if(usuarioRepository.existsById(usuarioId)) { 
			tempUsuario=usuarioRepository.findById(usuarioId).get(); 
			if(tempUsuario.getPassword().equals(changePassword.getPassword())) {
				tempUsuario.setPassword(changePassword.getNpassword());
				usuarioRepository.save(tempUsuario);
			}else {
				System.out.println("El password del usuario con ID["+
						tempUsuario.getId()+"] no coincide");
				tempUsuario=null;
			}
		}//if existsById
		return tempUsuario;
	}
}
	
	
	