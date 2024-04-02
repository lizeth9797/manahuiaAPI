package com.manahuia.manahuia.controller;

import javax.servlet.ServletException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Calendar;
import java.util.Date;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import com.manahuia.manahuia.model.Usuario;
import com.manahuia.manahuia.service.UsuarioService;
import com.manahuia.manahuia.config.JwtFilter;
import com.manahuia.manahuia.dto.Token;

@RestController
@RequestMapping(path="/api/login/") //http://localhost:8080/api/login/
public class LoginController {
	
	//private final LoginService loginService;
	private final UsuarioService usuarioService;
	@Autowired
	/*public LoginController(LoginService loginService ) {
		this.loginService=loginService;
	}*/
	public LoginController(UsuarioService usuarioService) {
		this.usuarioService=usuarioService;
	}//constructor
	
	
	@PostMapping
	public Token loginUser(@RequestBody Usuario usuario) throws ServletException {
		if(usuarioService.validateUser(usuario)) {
			System.out.println("Usuario válido "+usuario.getCorreo());
			return new Token(generateToken(usuario.getCorreo()));
		}//if
		throw new ServletException("Nombre de usuario o contraseña incorrectos "+usuario.getCorreo());
	}
	
	
	private String generateToken(String username) {
		Calendar calendar = Calendar.getInstance();//Fecha hora actual
		calendar.add(Calendar.HOUR, 10); // Pruebas
		//calendar.add(Calendar.MINUTE, 30);// Producción
		return Jwts.builder().setSubject(username).claim("role", "user")//'user'rol Admin para manahuia
		.setIssuedAt(new Date())
		.setExpiration(calendar.getTime())
		.signWith(SignatureAlgorithm.HS256, JwtFilter.secret)
		.compact();
	}//generateToken
	
	
	/*
	//Get by ID
	@GetMapping (path= "{loginId}")
	public Login getLogin(@PathVariable("loginId") int loginId) {
		return loginService.getLogin(loginId);
	}
	
	//POST 
	@PostMapping
	public Login addLogin(@RequestBody Login login) {
		return loginService.addLogin(login);
	}
	*/
}
