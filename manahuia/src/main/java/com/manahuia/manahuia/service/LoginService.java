package com.manahuia.manahuia.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.manahuia.manahuia.model.Login;

@Service
public class LoginService {
	public final ArrayList<Login> list = new ArrayList();
	public LoginService() {
		list.add( new Login("abi21@gmail.com","Par4gua$",1,1));
		list.add( new Login("liz@gmail.com","Par4gua$",0,2));
		list.add( new Login("jos@gmail.com","Par4gua$",0,3));
	}

	public Login getLogin(int loginId) {
		Login tempLogin=null;
		for (Login login : list) {
			if(login.getId()==loginId) {
				tempLogin=login;
				break;
			}
		}
		return tempLogin;
	}

	public Login addLogin(Login login) {
		Login tempLogin=null;
		if(list.add(login)) {
			tempLogin=login;
		}
		return tempLogin;
	}
	
	

}
