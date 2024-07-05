package com.ts.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ts.Repository.LoginRepository;
import com.ts.model.Tata;

public class LoginService {
	
	@Autowired
	LoginRepository loginRepository;
	
	public Tata login(String username, String password) {
		return loginRepository.findByUsernameAndPassward(username, password);
}
}
