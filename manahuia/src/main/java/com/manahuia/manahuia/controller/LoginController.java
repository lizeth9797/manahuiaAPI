package com.manahuia.manahuia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manahuia.manahuia.model.Login;
import com.manahuia.manahuia.service.LoginService;

@RestController
@RequestMapping(path="/api/login/") //http://localhost:8080/api/login/
public class LoginController {
	private final LoginService loginService;
	@Autowired
	public LoginController(LoginService loginService ) {
		this.loginService=loginService;
	}//constructor
	
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
}
