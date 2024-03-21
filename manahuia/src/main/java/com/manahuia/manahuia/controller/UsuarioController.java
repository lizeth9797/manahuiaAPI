package com.manahuia.manahuia.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manahuia.manahuia.model.Usuario;
import com.manahuia.manahuia.service.UsuarioService;

@RestController
@RequestMapping(path="/api/usuario/") //http://localhost:8080/api/usuario/
public class UsuarioController {
	
	private final UsuarioService usuarioService;
	@Autowired
	public UsuarioController(UsuarioService usuarioService ) {
		this.usuarioService=usuarioService;
	}//constructor
	
	//GET all
	@GetMapping
	public ArrayList<Usuario> getUsuarios(){
		return usuarioService.getAllUsuarios();
	}
	
	//Get by ID
	@GetMapping (path= "{usuarioId}")
	public Usuario getUsuario(@PathVariable("usuarioId") int usuarioId) {
		return usuarioService.getUsuario(usuarioId);
	}
	
	//POST 
	@PostMapping
	public Usuario addUsuario(@RequestBody Usuario usuario) {
		return usuarioService.addUsuario(usuario);
	}
}
